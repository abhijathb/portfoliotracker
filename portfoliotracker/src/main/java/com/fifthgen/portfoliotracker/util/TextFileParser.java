package com.fifthgen.portfoliotracker.util;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class TextFileParser {
	public static List<String> readLines(String filePath){
		
		List<String> lines = new ArrayList<String>();
		try {
			lines = Files.readAllLines(Paths.get(filePath));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return lines;
	}
}
