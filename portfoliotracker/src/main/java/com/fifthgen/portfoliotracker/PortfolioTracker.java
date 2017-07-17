package com.fifthgen.portfoliotracker;

import java.util.ArrayList;
import java.util.List;

import com.fifthgen.portfoliotracker.models.Client;
import com.fifthgen.portfoliotracker.services.StockService;
import com.fifthgen.portfoliotracker.services.StockServiceImpl;
import com.fifthgen.portfoliotracker.util.TextFileParser;

/**
 * Hello world!
 *
 */
public class PortfolioTracker 
{
    public static void main( String[] args )
    {
        List<Client> clientList = new ArrayList<Client>();
        
        List<String> lines = TextFileParser.readLines(args[0]/*"./src/main/java/com/fifthgen/portfoliotracker/resources/portfolio.txt"*/);
        StockService service = new StockServiceImpl();
        
        for(String s: lines)
        	clientList.add(service.generateClient(s));
        
        List<Client> sortedClientList = service.sortByStockOwnsership(clientList);
       
        for(Client c:sortedClientList)
        	System.out.println(c.getOrigFileString());
        /*for(int i=sortedClientList.size()-1; i>=0 ;i--)
        	System.out.println(sortedClientList.get(i).getOrigFileString());*/
    }
}
