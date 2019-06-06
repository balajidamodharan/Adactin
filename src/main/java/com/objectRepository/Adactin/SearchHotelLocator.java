package com.objectRepository.Adactin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.html5.Location;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.resources.Adactin.Baseclass;

public class SearchHotelLocator extends Baseclass {
public SearchHotelLocator() {
	PageFactory.initElements(driver, this);
}

@FindBy(id="location")
private WebElement textlocation;

@FindBy(id="hotels")
private WebElement texthotel;

@FindBy(id="room_type")
private WebElement textroomtype;

@FindBy(id="room_nos")
private WebElement textrooms;

@FindBy(id="datepick_in")
private WebElement textcheckindate;

@FindBy(id="datepick_out")
private WebElement textcheckoutdate;

@FindBy(id="adult_room")
private WebElement textadultroom;

@FindBy(id="child_room")
private WebElement textchildroom;

@FindBy(id="Submit")
private WebElement searchbutton;

@FindBy(id="radiobutton_0")
private WebElement textradiobutton;

@FindBy(id="continue")
private WebElement continuebutton;

public WebElement getTextlocation() {
	return textlocation;
}

public WebElement getTexthotel() {
	return texthotel;
}

public WebElement getTextroomtype() {
	return textroomtype;
}

public WebElement getTextrooms() {
	return textrooms;
}

public WebElement getTextcheckindate() {
	return textcheckindate;
}

public WebElement getTextcheckoutdate() {
	return textcheckoutdate;
}

public WebElement getTextadultroom() {
	return textadultroom;
}

public WebElement getTextchildroom() {
	return textchildroom;
}

public WebElement getSearchbutton() {
	return searchbutton;
}

public WebElement getTextradiobutton() {
	return textradiobutton;
}

public WebElement getContinuebutton() {
	return continuebutton;
}


}
