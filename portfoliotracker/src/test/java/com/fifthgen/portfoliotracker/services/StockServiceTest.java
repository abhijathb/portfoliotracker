package com.fifthgen.portfoliotracker.services;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.fifthgen.portfoliotracker.models.Client;
import com.fifthgen.portfoliotracker.models.Stock;

public class StockServiceTest {

	StockService service = new StockServiceImpl();
	
	@Test
	public void TestSortByStockOwnsership(){
		
		List<Stock> stockSet1 = new ArrayList<Stock>();
		List<Stock> stockSet2 = new ArrayList<Stock>();
		List<Stock> stockSet3 = new ArrayList<Stock>();
		List<Stock> stockSet4 = new ArrayList<Stock>();
		List<Stock> stockSet5 = new ArrayList<Stock>();
		
		Stock s1 = new Stock("EBAY",100);
		Stock s2 = new Stock("FKRT",75);
		Stock s3 = new Stock("FCBK",120);
		Stock s4 = new Stock("CANL",60);
		Stock s5 = new Stock("ICIC",100);
		
		stockSet1.add(s1);
		stockSet2.add(s2);
		stockSet2.addAll(stockSet1);
		stockSet3.add(s3);
		stockSet3.addAll(stockSet2);
		stockSet4.add(s4);
		stockSet4.addAll(stockSet3);
		stockSet5.add(s5);
		
		Client c1 = new Client();
		Client c2 = new Client();
		Client c3 = new Client();
		Client c4 = new Client();
		Client c5 = new Client();
		
		c1.setStockList(stockSet3);
		c2.setStockList(stockSet1);
		c3.setStockList(stockSet4);
		c4.setStockList(stockSet2);
		c5.setStockList(stockSet5);
		
		List<Client> clientList = new ArrayList<Client>();
		clientList.add(c1);
		clientList.add(c2);
		clientList.add(c3);
		clientList.add(c4);
		clientList.add(c5);
		
		clientList = service.sortByStockOwnsership(clientList);
		
		List<Client> resList = new ArrayList<Client>();
		resList.add(c3);
		resList.add(c1);
		resList.add(c4);
		resList.add(c2);
		resList.add(c5);
		
		assertEquals(resList, clientList);
	}
	
	@Test
	public void TestGenerateClient(){
		String fileLine = "SGI - 100, GOOG - 50, MS - 10";
		Client c = service.generateClient(fileLine);
		List<Stock> sl = new ArrayList<Stock>();
		
		sl.add(new Stock("SGI",100));
		sl.add(new Stock("GOOG",50));		
		sl.add(new Stock("MS",10));		
		Client resClient = new Client();
		resClient.setStockList(sl);
		
		for(int i=0;i<3;i++){
			assertEquals(c.getStockList().get(i).getStockName(),resClient.getStockList().get(i).getStockName());
			assertEquals(c.getStockList().get(i).getStockQty(),resClient.getStockList().get(i).getStockQty());
		}
	}
}
