package fr.univrouen.rss22.model;

import java.io.IOException;
import java.util.Scanner;

import org.springframework.core.io.DefaultResourceLoader;

public class TestRSS {
	
	public String loadFileXML() {
		try {
			org.springframework.core.io.Resource resource = new DefaultResourceLoader().
				getResource("classpath:xml/item.xml");
			Scanner scan = new Scanner(resource.getInputStream());
			String result = "";
			while(scan.hasNextLine()) {
				result += scan.nextLine();
			}
			scan.close();
			return result;
		}
		catch (IOException e) {
			return "Can't read XML file."
					+ "\n"
					+ "Error : " + e.getMessage();
		}
	}
}	
