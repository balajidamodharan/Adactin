package com.resources.Adactin;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.stepDefinition.Hooks;

public class Baseclass {
public static WebDriver driver=null;
	public static WebDriver launchbrowser(String url) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dhamu\\eclipse-workspace\\Balaji\\MavenDemo\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
	return driver;
	}
	
	public static void closebrowser() {
		driver.quit();

	}
	
	public static void type(WebElement e,String s) {
		e.sendKeys(s);

	}
	public static void click(WebElement e) {
		e.click();

	}
	public static void clear(WebElement e) {
		e.clear();

	}
	public static void gettext(WebElement e) {
		e.getText();

	}
	public static void dropdowntext(WebElement e, String t) {
		Select dropdowntext=new Select(e);
		dropdowntext.selectByVisibleText(t);

	}
	public static void dropdownindex(WebElement e, int i) {
		Select dropdownindex=new Select(e);
	    dropdownindex.selectByIndex(i);

	}
	public static void dropdownvalue(WebElement e,String t) {
		Select dropdownvalue=new Select(e);
		dropdownvalue.selectByValue(t);
		
	}
	public static void movetoelement(WebElement e) {
		Actions a=new Actions(driver);
		a.moveToElement(e).perform();

	}
	public static void doubleclick(WebElement e) {
		Actions a= new Actions(driver);
		a.doubleClick(e).perform();

	}
	
	public static void alert(String alerttype ,String action) {
		Alert a=driver.switchTo().alert();
		if(alerttype.equalsIgnoreCase("simple")) {
			if(action.equalsIgnoreCase("accept")) {
				a.accept();
			}
		}else if(alerttype.equalsIgnoreCase("confirm")) {
			if(action.equalsIgnoreCase("accept")) {
				a.accept();
			}else if(action.equalsIgnoreCase("dismiss")) {
				a.dismiss();
			}
		}else if(alerttype.equalsIgnoreCase("prompt")) {
			if(action.equalsIgnoreCase("accept")) {
				a.sendKeys("yes");
				a.accept();
			}else if(action.equalsIgnoreCase("dismiss")) {
				a.sendKeys("no");
				a.dismiss();
			}
		}

	}
}