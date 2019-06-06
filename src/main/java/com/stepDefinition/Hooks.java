package com.stepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.resources.Adactin.Baseclass;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends Baseclass {
	 static WebDriver driver;
@Before
public void launch() {
	launchbrowser("http://adactin.com/HotelApp/index.php");

}
@After
public void close() {
	closebrowser();

}
}
