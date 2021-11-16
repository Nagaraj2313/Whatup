package org.logins;

import org.json.Reporting;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\nagaraj\\eclipse-workspace\\CucuBaseTaskfour\\src\\test\\resources", glue= {"org.loginfinal"},plugin= {"pretty","json:C:\\Users\\nagaraj\\eclipse-workspace\\CucuBaseTaskfour\\src\\test\\java\\org\\json\\outlook.json"})
public class Textrunner {
	@AfterClass
	public static void afterClass() {
		Reporting.generateJvmRoporting("C:\\\\Users\\\\nagaraj\\\\eclipse-workspace\\\\CucuBaseTaskfour\\\\src\\\\test\\\\java\\\\org\\\\json\\\\outlook.json");

	}

}
