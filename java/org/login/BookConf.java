package org.login;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookConf extends BassClassAdactin{
	public BookConf() {
		PageFactory.initElements(driver, this);
	}
@FindBy(id="order_no")
private WebElement orderid;


public WebElement getOrderid() {
	return orderid;
}


public void pagefive() {
	GetAttribute(getOrderid());
	
	
}
}
