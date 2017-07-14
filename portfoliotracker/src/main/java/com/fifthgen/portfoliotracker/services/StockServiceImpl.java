package com.fifthgen.portfoliotracker.services;

import java.util.Collections;
import java.util.List;

import com.fifthgen.portfoliotracker.models.Client;
import com.fifthgen.portfoliotracker.models.Stock;
import com.fifthgen.portfoliotracker.services.StockComparator;

public class StockServiceImpl implements StockService {

	@Override
	public List<Client> sortByStockOwnsership(List<Client> clientList) {
		
		Collections.sort(clientList, new StockComparator());
		return clientList;
	}

	@Override
	public Client generateClient(String fileLine) {
		Client newClient = new Client();
		Stock stock = new Stock();
		
		String[] splitStocks = fileLine.split(",");
		for(String s : splitStocks){
			
			String[] s2 = s.split("-");
			stock.setStockName(s2[0].trim());
			stock.setStockQty(Integer.parseInt(s2[1].trim()));
			newClient.addStock(stock);
			newClient.setOrigFileString(fileLine);
		}
		return newClient;
	}
}
