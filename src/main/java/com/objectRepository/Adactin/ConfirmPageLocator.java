package com.objectRepository.Adactin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.resources.Adactin.Baseclass;

public class ConfirmPageLocator extends Baseclass {
public ConfirmPageLocator() {
	PageFactory.initElements(driver, this);
}
@FindBy(id="order_no")
private WebElement textorderno;

@FindBy(id="my_itinerary")
private WebElement myitinerary;

@FindBy(id="check_all")
private WebElement checkbox;

@FindBy(name="cancelall")
private WebElement cancelbutton;

@FindBy(id="logout")
private WebElement logout;

public WebElement getTextorderno() {
	return textorderno;
}

public WebElement getMyitinerary() {
	return myitinerary;
}

public WebElement getCheckbox() {
	return checkbox;
}

public WebElement getCancelbutton() {
	return cancelbutton;
}

public WebElement getLogout() {
	return logout;
}

}
