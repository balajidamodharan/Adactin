package com.stepDefinition;

import java.util.concurrent.TimeUnit;

import com.objectRepository.Adactin.BookHotelLocator;
import com.objectRepository.Adactin.ConfirmPageLocator;
import com.objectRepository.Adactin.LoginLocator;
import com.objectRepository.Adactin.SearchHotelLocator;
import com.resources.Adactin.Baseclass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class AdactinStep extends Baseclass {


@Given("^User login the adactin page \"([^\"]*)\" and \"([^\"]*)\"$")
public void user_login_the_adactin_page_and(String username, String password) throws InterruptedException {
	
	LoginLocator l=new LoginLocator();
	type(l.getTextemail(),username );
	type(l.getTextpass(), password);
	click(l.getLoginbutton());
}

@When("^User enter the details in search hotel page \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\" and \"([^\"]*)\"$")
public void user_enter_the_details_in_search_hotel_page_and(String location, String hotel, String roomtype, String numrooms, String chechin, String checkout, String adtcount, String chdcount) throws InterruptedException  {
	SearchHotelLocator s=new SearchHotelLocator();
	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	dropdowntext(s.getTexthotel(), location);
	dropdowntext(s.getTexthotel(), hotel);
	dropdowntext(s.getTextroomtype(), roomtype);
	dropdowntext(s.getTextrooms(), numrooms);
	clear(s.getTextcheckindate());
	type(s.getTextcheckindate(), chechin);
	clear(s.getTextcheckoutdate());
	type(s.getTextcheckoutdate(), checkout);
	dropdowntext(s.getTextadultroom(), adtcount);
	dropdowntext(s.getTextchildroom(), chdcount);
	click(s.getTextradiobutton());
	click(s.getContinuebutton());
	
}

@When("^User enter the details in booking hotel page \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\" and \"([^\"]*)\"$")
public void user_enter_the_details_in_booking_hotel_page_and(String firstname, String lastname, String address, String cardno, String cardtype, String expmonth, String expyear, String ccv) {
	BookHotelLocator b=new BookHotelLocator();
	type(b.getTextfirstname(), firstname);
	type(b.getTextlastname(), lastname);
	type(b.getTextaddress(), address);
	type(b.getTextcardno(), cardno);
    dropdowntext(b.getTextcardtype(), cardtype);
    dropdowntext(b.getExpmonth(), expmonth);
    dropdowntext(b.getExpyear(), expyear);
    type(b.getCvvno(), ccv);
    click(b.getBookbutton());
    
    ConfirmPageLocator c=new ConfirmPageLocator();
    gettext(c.getTextorderno());
    click(c.getMyitinerary());
    click(c.getCheckbox());
    click(c.getCancelbutton());
    click(c.getLogout());
}


}
