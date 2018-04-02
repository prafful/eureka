package com.microservice.stockquote.entity;

import java.util.List;

public class StockQuoteList {
	
	private String username;
	private List<String> quotes;
	
	
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public List<String> getQuotes() {
		return quotes;
	}
	public void setQuotes(List<String> quotes) {
		this.quotes = quotes;
	}
	
	public StockQuoteList(String username, List<String> quotes) {
		super();
		this.username = username;
		this.quotes = quotes;
	}
	
	public StockQuoteList() {
		
		
	}
	
	
	
	
	
	

}
