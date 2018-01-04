package com.java.JFree.Visuals;

public class Apple {
public Apple(String date, String open, String high, String low, String close, String volume) {
		super();
		Date = date;
		Low = low;
		High = high;
		Close = close;
		Volume = volume;
		Open = open;
	}
public String getDate() {
		return Date;
	}
	public void setDate(String date) {
		Date = date;
	}
	public String getLow() {
		return Low;
	}
	public void setLow(String low) {
		Low = low;
	}
	public String getHigh() {
		return High;
	}
	public void setHigh(String high) {
		High = high;
	}
	public String getClose() {
		return Close;
	}
	public void setClose(String close) {
		Close = close;
	}
	public String getVolume() {
		return Volume;
	}
	public void setVolume(String volume) {
		Volume = volume;
	}
	public String getOpen() {
		return Open;
	}
	public void setOpen(String open) {
		Open = open;
	}
String Date;
String Low;
String High;
String Close;
String Volume;
String Open;

}
