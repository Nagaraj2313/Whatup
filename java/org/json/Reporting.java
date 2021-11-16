package org.json;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;





public class Reporting {
	public static void generateJvmRoporting(String jsonfile) {
		File file = new File("C:\\Users\\nagaraj\\eclipse-workspace\\CucuBaseTaskfour\\Reporting");
		Configuration configuration = new Configuration(file, "Adactin Hotel Reporting");
		configuration.addClassifications("BrowserName", "Chrome");
		configuration.addClassifications("version", "92");
		configuration.addClassifications("Spring","2 Weeks=1 spring");
		configuration.addClassifications("os", "Window 10");
		List<String > li = new ArrayList<String>();
		li.add(jsonfile);
		ReportBuilder builder = new ReportBuilder(li, configuration);
		builder.generateReports();
		
		
	

}}
