package com.objectRepository.Adactin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.resources.Adactin.Baseclass;

public class LoginLocator extends Baseclass {
public LoginLocator() {
	PageFactory.initElements(driver, this);
}
@FindBy(id="username")
private WebElement textemail;

@FindBy(id="password")
private WebElement textpass;

@FindBy(id="login")
private WebElement loginbutton;

public WebElement getTextemail() {
	return textemail;
}

public WebElement getTextpass() {
	return textpass;
}

public WebElement getLoginbutton() {
	return loginbutton;
}

}