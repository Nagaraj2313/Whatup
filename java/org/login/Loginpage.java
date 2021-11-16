package org.login;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public  class Loginpage extends BassClassAdactin {
	public Loginpage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id = "username")
	private WebElement textUserName;

	@FindBy(id = "password")
	private WebElement textpassword;

	@FindBy(id = "login")
	private WebElement clickbtn;

	public WebElement getTextUserName() {
		return textUserName;
	}

	public WebElement getTextpassword() {
		return textpassword;
	}

	public WebElement getClickbtn() {
		return clickbtn;
	}

	public void pageone(String UserName, String Password) {
		textEnter(getTextUserName(), UserName);
		textEnter(getTextpassword(), Password);
		clickbtn(getClickbtn());
		

	}
}
