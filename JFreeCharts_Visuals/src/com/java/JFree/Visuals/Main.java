package com.java.JFree.Visuals;

import org.jfree.chart.demo.BarChartDemo1;
import org.jfree.ui.RefineryUtilities;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BarcharPhone chart = new BarcharPhone(null);
		chart.renderBarChart();
		chart.pack( );        
	    RefineryUtilities.centerFrameOnScreen( chart );        
	    chart.setVisible( true ); 
	}

}
