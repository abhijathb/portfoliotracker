package com.fifthgen.portfoliotracker.util;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class TextFileParserTest {

	@Test
	public void TestReadLines(){
		List<String> s = new ArrayList<String>();
		s.add("GOOG - 50, MS - 10");
		s.add("SGI - 100, GOOG - 50, MS - 10");
		s.add("DOW - 300");
		s.add("GOOG - 100, AMZN - 90, MS - 80");
		
		String filePath = "./src/main/java/com/fifthgen/portfoliotracker/resources/portfolio.txt";
		List<String> resList = TextFileParser.readLines(filePath);	
		
		assertEquals(s,resList);
	}
}
