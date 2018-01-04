package com.java.JFree.Visuals;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.io.CSV;
import org.jfree.ui.ApplicationFrame;
import org.jfree.chart.ChartUtilities;

public class BarcharPhone extends ApplicationFrame {
   
   public BarcharPhone(String title) {
		super(title);
		// TODO Auto-generated constructor stub
	}

public void renderBarChart()throws Exception {
	  org.jfree.data.io.CSV data = new CSV();
	  

      final CategoryDataset dataset = data.readCategoryDataset(new FileReader("Phonelog.csv"));

      JFreeChart barChart = ChartFactory.createBarChart(
         "PHONE CALL STATISTICS", 
         "Category", "Frequency", 
         dataset,PlotOrientation.VERTICAL, 
         true, true, false);
         
      int width = 640;    /* Width of the image */
      int height = 480;   /* Height of the image */ 
      File BarChart = new File( "BarChart.jpeg" ); 
      ChartUtilities.saveChartAsJPEG( BarChart , barChart , width , height );
      ChartPanel chartPanel = new ChartPanel( barChart );        
      chartPanel.setPreferredSize(new java.awt.Dimension( 560 , 367 ) );        
      setContentPane( chartPanel ); 
   }
}
