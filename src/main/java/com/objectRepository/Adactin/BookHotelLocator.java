package com.objectRepository.Adactin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.resources.Adactin.Baseclass;

public class BookHotelLocator extends Baseclass {
public BookHotelLocator() {
	PageFactory.initElements(driver, this);
	
}
@FindBy(id="first_name")
private WebElement textfirstname;

@FindBy(id="last_name")
private WebElement textlastname;

@FindBy(id="address")
private WebElement textaddress;

@FindBy(id="cc_num")
private WebElement textcardno;

@FindBy(id="cc_type")
private WebElement textcardtype;

@FindBy(id="cc_exp_month")
private WebElement expmonth;

@FindBy(id="cc_exp_year")
private WebElement expyear;

@FindBy(id="cc_cvv")
private WebElement cvvno;

@FindBy(id="book_now")
private WebElement bookbutton;

public WebElement getTextfirstname() {
	return textfirstname;
}

public WebElement getTextlastname() {
	return textlastname;
}

public WebElement getTextaddress() {
	return textaddress;
}

public WebElement getTextcardno() {
	return textcardno;
}

public WebElement getTextcardtype() {
	return textcardtype;
}

public WebElement getExpmonth() {
	return expmonth;
}

public WebElement getExpyear() {
	return expyear;
}

public WebElement getCvvno() {
	return cvvno;
}

public WebElement getBookbutton() {
	return bookbutton;
}
}
