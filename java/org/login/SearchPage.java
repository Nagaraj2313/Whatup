package org.login;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage extends BassClassAdactin {
	public SearchPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id = "location")
	private WebElement location;
	@FindBy(id = "hotels")
	private WebElement hotel;
	@FindBy(id = "room_type")
	private WebElement room;
	@FindBy(id = "room_nos")
	private WebElement roomNo;
	@FindBy(id = "datepick_in")
	private WebElement datep;
	@FindBy(id = "datepick_out")
	private WebElement datepickO;
	@FindBy(id = "adult_room")
	private WebElement roommember;
	@FindBy(id = "child_room")
	private WebElement childroom;
	@FindBy(id = "Submit")
	private WebElement subbtn;

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotel() {
		return hotel;
	}

	public WebElement getRoom() {
		return room;
	}

	public WebElement getRoomNo() {
		return roomNo;
	}

	public WebElement getDatep() {
		return datep;
	}

	public WebElement getDatepickO() {
		return datepickO;
	}

	public WebElement getRoommember() {
		return roommember;
	}

	public WebElement getChildroom() {
		return childroom;
	}

	public WebElement getSubbtn() {
		return subbtn;
	}

	public void pagetwo(String location, String Hotels, String roomType, String NoofRoom, String CheckinDate, String CheckOutDate, String AdultsperRoom, String ChildrenperRoom) {
		selectvisible(getLocation(), location);
		selectvisible(getHotel(), Hotels);
		selectvisible(getRoom(), roomType);
		selectValue(getRoomNo(), NoofRoom);
		clear(getDatep());
		textEnter(getDatep(), CheckinDate);
		clear(getDatepickO());
		textEnter(getDatepickO(), CheckOutDate);
		selectValue(getRoommember(), AdultsperRoom);
		selectValue(getChildroom(), ChildrenperRoom);
		clickbtn(getSubbtn());
		
		
		

	}
}
