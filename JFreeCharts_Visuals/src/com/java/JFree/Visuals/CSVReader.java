package com.java.JFree.Visuals;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

public class CSVReader {
public List<String[]> readFile(String file) throws IOException{
	FileReader reader;
	String line;
	List<String[]> list = new ArrayList();
	String[] temp;
	int line_count=0;
	try {
		reader = new FileReader(file);
		BufferedReader breader = new BufferedReader(reader);
		while((line = breader.readLine())!=null){
			/*
			if(line_count == 0)
				continue;
			*/
			temp = line.split(",");
			list.add(temp);
		}
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return list;
}
}
