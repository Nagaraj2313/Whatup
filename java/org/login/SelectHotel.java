package org.login;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotel extends BassClassAdactin {
	public SelectHotel() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "radiobutton_0")
	private WebElement button;
	@FindBy(id = "continue")
	private WebElement cont;

	public WebElement getButton() {
		return button;
	}

	public WebElement getCont() {
		return cont;
	}
	
	public void pageThree() {
		clickbtn(getButton());
		clickbtn(getCont());
		
	}

}
