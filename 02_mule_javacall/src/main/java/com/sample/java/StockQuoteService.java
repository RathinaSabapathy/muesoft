package com.sample.java;

public class StockQuoteService {

	public static String sayHello(String name, String city) {
		return "My name is Mr."+name+".I am from city "+city;
	}
	
	public String getStockQuote(String stockName) {
		String value="Stock does not exist";
		
		if(stockName.equalsIgnoreCase("tesla")) {
			value="4000"; 
		}else if(stockName.equalsIgnoreCase("bmw")) {
			value = "3000";
		}else if(stockName.equalsIgnoreCase("tata")) {
			value= "2000";
		}
		return value;
	}
}
