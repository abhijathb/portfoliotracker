package com.fifthgen.portfoliotracker.models;

public class Stock {
	int stockQty;
	String stockName;
	public Stock() {
		super();
	}
	public Stock(String stockName, int stockQty) {
		super();
		this.stockQty = stockQty;
		this.stockName = stockName;
	}
	public int getStockQty() {
		return stockQty;
	}
	public void setStockQty(int stockQty) {
		this.stockQty = stockQty;
	}
	public String getStockName() {
		return stockName;
	}
	public void setStockName(String stockName) {
		this.stockName = stockName;
	}
	@Override
	public String toString() {
		return "Stock [stockQty=" + stockQty + ", stockName=" + stockName + "]";
	}
}
