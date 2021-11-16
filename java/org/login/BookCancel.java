package org.login;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookCancel extends BassClassAdactin {
	public BookCancel() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="order_id_text")
	private WebElement search;
	@FindBy(id="search_hotel_id")
	private WebElement ClickGo;
	@FindBy(xpath="(//input[@type='button'])[1]")
	private WebElement Cancelbutton;
	@FindBy(xpath="//a[text()='Booked Itinerary']")
	private WebElement bookingcancel;
	@FindBy(id="order_no")
	private WebElement orderid;


	



	public WebElement getSearch() {
		return search;
	}
	public WebElement getClickGo() {
		return ClickGo;
	}
	public WebElement getCancelbutton() {
		return Cancelbutton;
	}
	public WebElement getBookingcancel() {
		return bookingcancel;
		
	}
	public WebElement getOrderid() {
		return orderid;
	}
	public void pagesixfinal() {
		String getAttribute = GetAttribute(getOrderid());
		
		clickbtn(getBookingcancel());
		clickbtn(getSearch());
		textEnter(getSearch(), getAttribute);
		clickbtn(getClickGo());
		clickbtn(getCancelbutton());
		alerts();
		
	}

}
