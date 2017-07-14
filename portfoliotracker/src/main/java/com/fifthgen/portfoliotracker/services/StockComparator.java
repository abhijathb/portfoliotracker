package com.fifthgen.portfoliotracker.services;

import java.util.Comparator;

import com.fifthgen.portfoliotracker.models.Client;

public class StockComparator implements Comparator<Client>{
	
	 public int compare(Client c1, Client c2) {
		    if (c1.getTotalStockQty() > c2.getTotalStockQty()) return -1;
		    if (c1.getTotalStockQty() < c2.getTotalStockQty()) return 1;
		    return 0;
		  }
}
