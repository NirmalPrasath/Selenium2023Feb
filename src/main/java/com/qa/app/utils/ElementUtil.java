package com.qa.app.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementUtil {
	
	private WebDriver driver;
	
	public ElementUtil(WebDriver driver){
		
		this.driver=driver;
		
	}
	
	public By getBY(String locatorType, String locatorValue)
	{
		By locator=null;
		switch(locatorType.toLowerCase()) {
		case"id":
			locator=By.id(locatorValue);
			break;
		case"name":
			locator=By.name(locatorValue);
			break;
		case"classname":
			locator=By.className(locatorValue);
			break;
		case"xpath":
			locator=By.xpath(locatorValue);
			break;
		case"cssselector":
			locator=By.cssSelector(locatorValue);
			break;
		case"linktext":
			locator=By.linkText(locatorValue);
			break;
			default:
				System.out.println("Please pass right locator and value");
		}
		
		
		return locator;
		
	}
	
	public WebElement getElement(By locator)
	{
		return driver.findElement(locator);
	}
	
	public void doSendKey(By locator, String Value)
	{
		getElement(locator).sendKeys(Value);
	}
	
	public WebElement getElement(String locatorType, String locatorValue)
	{
		return driver.findElement(getBY(locatorType, locatorValue));
	}
	

	
	public boolean doIsdisplayed(By locator)
	{
		
		return getElement(locator).isDisplayed();
		
	}

	public void doClick(By locator)
	{
		
		getElement(locator).click();
		
	}
	
	public String getTitle()
	{
		return driver.getTitle();
		
	}
	
	public String getuRL()
	{
		return driver.getCurrentUrl();
		
	}
}
