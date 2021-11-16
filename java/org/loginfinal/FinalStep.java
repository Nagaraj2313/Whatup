package org.loginfinal;



import org.login.BassClassAdactin;
import org.login.BookCancel;
import org.login.BookConf;
import org.login.Bookpage;
import org.login.Loginpage;
import org.login.SearchPage;
import org.login.SelectHotel;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FinalStep extends BassClassAdactin{
	
	
	@Given("User is on the Adactin hotel")
	public void user_is_on_the_Adactin_hotel() {
		 getdriver("chrome");
	  launchurl("https://adactinhotelapp.com/");
	 
	  implicitywait();
	}

	@When("User Should enter {string} and {string} and click")
	public void user_Should_enter_and_and_click(String UserName, String Password) {
	    Loginpage lp = new Loginpage();
	    lp.pageone(UserName, Password);
	   
	}

	@When("Select location for step {string} and {string} and {string} and {string} and {string} and {string} and {string} and {string}")
	public void select_location_for_step_and_and_and_and_and_and_and(String location, String Hotels, String roomType, String NoofRoom, String CheckinDate, String CheckOutDate, String AdultsperRoom, String ChildrenperRoom) {
		SearchPage sp = new SearchPage();
		sp.pagetwo(location, Hotels, roomType, NoofRoom, CheckinDate, CheckOutDate, AdultsperRoom, ChildrenperRoom);
		
	
	    
	}

	@When("User to Select the Hotel  to confirm")
	public void user_to_Select_the_Hotel_to_confirm() {
	    SelectHotel sh = new SelectHotel();
	    sh.pageThree();
	}
	

	@When("Main booking {string} and {string} and {string} and {string} and {string} and {string} and  {string} and {string}  and Click")
	public void main_booking_and_and_and_and_and_and_and_and_Click(String firstName, String LastName, String Address, String CreditNo, String CardType, String ExpMonth, String ExpYear, String Cvv) {
	    Bookpage bk = new Bookpage();
	    bk.pagefour(firstName, LastName, Address, CreditNo, CardType, ExpMonth, ExpYear, Cvv);
	}

	@When("User to Confirm the book orderID  and click")
	public void user_to_Confirm_the_book_orderID_and_click() {
	   BookConf bc = new BookConf();
	   bc.pagefive();
	}

	@When("User to Cancel the room Search click")
	public void user_to_Cancel_the_room_Search_click() {
	  BookCancel bcan = new BookCancel();
	  bcan.pagesixfinal();
	}

	@Then("User should verify Book")
	public void user_should_verify_Book() {
	   quit();
	}



}
