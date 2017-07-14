package com.fifthgen.portfoliotracker.services;

import java.util.List;

import com.fifthgen.portfoliotracker.models.Client;

public interface StockService {
	public List<Client> sortByStockOwnsership(List<Client> clientList);
	public Client generateClient(String fileLine);
}
