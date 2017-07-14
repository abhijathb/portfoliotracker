package com.fifthgen.portfoliotracker.models;

import java.util.ArrayList;
import java.util.List;

public class Client {
	String clientId;
	List<Stock> stockList = new ArrayList<Stock>();
	String origFileString;
	int totalStockQty = 0;
	
	public String getOrigFileString() {
		return origFileString;
	}
	public void setOrigFileString(String origFileString) {
		this.origFileString = origFileString;
	}
	public String getClientName() {
		return clientId;
	}
	public void setClientName(String clientName) {
		this.clientId = clientName;
	}
	public List<Stock> getStockList() {
		return stockList;
	}
	public void setStockList(List<Stock> stockList) {
		this.stockList = stockList;
	}
	public int getTotalStockQty(){
		int qty = 0;
		for(Stock s: stockList)
			qty += s.getStockQty();
		this.totalStockQty = qty;
		
		return totalStockQty;			
	}
	
	public void addStock(Stock stock){
		this.stockList.add(stock);
	}
}
