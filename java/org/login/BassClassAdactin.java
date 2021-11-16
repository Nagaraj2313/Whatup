package org.login;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.google.common.collect.Table.Cell;

import io.github.bonigarcia.wdm.WebDriverManager;

public  class BassClassAdactin {

		public static WebDriver driver;
		public static	Actions actions;
		public static	Robot robot;
		public static	Alert alert;
		public static	JavascriptExecutor executor;
		public static	Select select;


		public static void getdriver(String browserName) {
			if (browserName.equalsIgnoreCase("Chrome")) {
				WebDriverManager.chromedriver().setup();
				driver=new ChromeDriver();
			}

			else if (browserName.equalsIgnoreCase("FireFox")) {
				WebDriverManager.firefoxdriver().setup();
				driver=new FirefoxDriver();}
			else if (browserName.equalsIgnoreCase("Edge")) {
				WebDriverManager.edgedriver().setup();
				driver= new EdgeDriver();}
		}
		public static void launchurl(String url) {
			driver.get(url);

		}
		public static void enterText(WebElement Textuser,String data) {
			Textuser.sendKeys(data);}

		public static void textEnter(WebElement element, String text) {
			element.sendKeys(text);}

		public static void clickbtn(WebElement element) {
			element.click();}
		//page clear panitu add pandrathuku
		public void clear(WebElement element) {
			element.clear();

		}

		public static WebElement locators(String locator,String value) {
			WebElement element = null;
			if (locator.equalsIgnoreCase("id")) {
				element= driver.findElement(By.id(value));}

			else if (locator.equalsIgnoreCase("name")) {
				element= driver.findElement(By.name(value));

			} else if (locator.equalsIgnoreCase("xpath")) {
				element = driver.findElement(By.xpath(value));
			}else if (locator.equalsIgnoreCase("tagName")) {
			 element = driver.findElement(By.tagName(value));
				
			}
			return element;
		}
		public static List<WebElement> locatorElements(String locators, String value) {
			List<WebElement> findElements=null;
			if (locators.equalsIgnoreCase("id")) {
				List<WebElement> findelements = driver.findElements(By.id(value));
			}
			else if (locators.equalsIgnoreCase("name")) {
				List<WebElement> findelements = driver.findElements(By.name(value));


			}else if (locators.equalsIgnoreCase("tagName")) {
				List<WebElement> findelements = driver.findElements(By.tagName(value));
	                  }
			return findElements;
		}

		public void getTitle() {
			driver.getTitle();
		}
		public void getCurrentUrl() {
			driver.getCurrentUrl();
		}
		public void quit() {
			driver.quit();
		}
		public void manage() {
			driver.manage();
		}
		public  String gettext(WebElement element) {
			return element.getText();
		}
		public String GetAttribute(WebElement element) {
			return element.getAttribute("value");
		}
		//navigate
		public void naviagte(String url) {
			driver.navigate().to(url);
		}
		public void forward() {
			driver.navigate().forward();

		}
		public void backward() {
			driver.navigate().back();
		}
		public void refresh() {
			driver.navigate().refresh();
		}
		public void mouseOver(WebElement link) {
			actions.moveToElement(link).perform();

		}
		//DrapandDrop
		public void drapAndDrop(WebElement s,WebElement d) {
			actions.dragAndDrop(s, d).perform();
		}
		//RightClick
		public void rightClick(WebElement button) {
			actions.contextClick(button).perform();
		}
		public void doubleClick(WebElement dbutton) {
			actions.contextClick(dbutton).perform();

		}
		//robot
		public void presskey() {
			robot.keyPress(KeyEvent.VK_ENTER);
		}
		public void relaseKey() {
			robot.keyRelease(KeyEvent.VK_ENTER);
		}
		public void upnDownkey(WebElement element) {
			actions.keyDown(element,Keys.ENTER).keyUp(element,Keys.ENTER).perform();

		}
		//alert
		public static void alerts() {
			driver.switchTo().alert().accept();
		}
		public static void alertdis() {
			driver.switchTo().alert().accept();
		}
		//frames
		public static void framesstring(WebElement element) {
			driver.switchTo().frame(element);
		}
		public static void frameelement(WebElement element) {
			driver.switchTo().frame(element);
		}

		public static void frameinbex(int i) {
			driver.switchTo().frame(i);

		}
		//javascript
		public static void javaScriptInsert(WebElement element, String name) {
			executor=(JavascriptExecutor)driver;
			executor.executeScript("argument[0].SetAttribute('value','"+name+"')",element);

		}
		public void javaClick(WebElement element) {
			executor=(JavascriptExecutor)driver;
			executor.executeScript("argument[0].Click()", element);

		}
		public void javagetAt(WebElement element, String attributename) {
			executor=(JavascriptExecutor)driver;
			executor.executeScript("argument[0].GetAttribute('value','"+attributename+"')", element);
		}
		public void scrollUp(WebElement element) {
			executor= (JavascriptExecutor)driver;
			executor.executeScript("arguments[0].scrollIntoView(true)", element);
		}
		public void scrollDown(WebElement element) {
			executor= (JavascriptExecutor)driver;
			executor.executeScript("arguments[0].scrollIntoView(false)", element);
		}
		//DropDown Select
		public static void selectValue(WebElement element, String name) {
			select = new Select(element);
			select.selectByValue(name);

		}
		public static void selectIndex(WebElement element, int i) {
			select= new Select(element);
			select.selectByIndex(i);
		}
		public static void selectvisible(WebElement element, String name) {
			select = new Select(element);
			select.selectByVisibleText(name);
		}
		public static boolean selectMulti(WebElement element) {
			select =new Select(element);
			return  select.isMultiple();
		}
		public List<WebElement> selectGetAllOp(WebElement element) {
			select = new Select(element);
			return	select.getAllSelectedOptions();

		}
		private WebElement selectGetFirst(WebElement element) {
			select = new Select(element);
			return	select.getFirstSelectedOption();

		}
		//deselect
		public void deselectIndex(WebElement element, int i) {
			select = new Select(element);
			select.deselectByIndex(i);

		}
		public void deselectValue(WebElement element, String name) {
			select = new Select(element);
			select.deselectByValue(name);

		}
		public void deselectVisible(WebElement element, String name) {
			select = new Select(element);
			select.deselectByVisibleText(name);

		}
		public void deselectall(WebElement element) {
			select = new Select(element);
			select.deselectAll();

		}
		public static void implicitywait() {
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		}

		













	}


