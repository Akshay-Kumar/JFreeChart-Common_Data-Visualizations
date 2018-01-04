package com.java.JFree.Visuals;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;
import org.jfree.chart.ChartUtilities;

public class BarChart extends ApplicationFrame {
   
   public BarChart(String title) {
		super(title);
		// TODO Auto-generated constructor stub
	}

public void renderBarChart()throws Exception {
	  CSVReader reader = new CSVReader();
	  List<String[]> list = reader.readFile("aple.csv");
	  List<Apple> appleDataSet = new ArrayList();
	  int count=0;
	  for(String[] data : list){
		  if(count==0){
			  count++;
			  continue;
		  }
		  appleDataSet.add(new Apple(data[0], data[1],data[2],data[3],data[4],data[5]));
		  count++;
	  }
      final String Open = "Open";
      final String High = "High";
      final String Low = "Low";
      final String Close = "Close";
      final String Volume = "Volume";
      final String Date = "Date";

      final DefaultCategoryDataset dataset = new DefaultCategoryDataset( );
      for(Apple data : appleDataSet){
    	  dataset.addValue(Float.parseFloat(data.getLow()),Low,data.getDate());
    	  dataset.addValue(Float.parseFloat(data.getHigh()),High,data.getDate());
    	  dataset.addValue(Float.parseFloat(data.getOpen()),Open,data.getDate());
    	  dataset.addValue(Float.parseFloat(data.getClose()),Close,data.getDate());
      }

      JFreeChart barChart = ChartFactory.createBarChart(
         "APPLE STOCKS STATISTICS", 
         "Category", "Price", 
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
