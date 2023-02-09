package com.qa.app.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.app.utils.ElementUtil;

public class AccountPage {
	
	private WebDriver driver;
	private ElementUtil eleUtil;
	public AccountPage (WebDriver driver)
	{
		this.driver=driver;
		eleUtil=new  ElementUtil(driver);
	}
	
	
	By heading=By.xpath("//div[@id='content']/h2[1]");
	By accInfoLink=By.xpath("//a[text()='Edit your account information']");
	private By email=By.name("email");
	private By password=By.id("input-password");
	private By loginButton=By.xpath("//button[@type='submit']");
	
	
	public String getAccountPageTitle() 
	{
		
		return eleUtil.getTitle();
		
	}
	
	public String getAccountPageUrl()
	{
		return eleUtil.getuRL();
		
	}
	
	public boolean getAccPageHeading()
	{
		return eleUtil.doIsdisplayed(heading);
	}
	
	public boolean getAccInfoLink()
	{
		return eleUtil.doIsdisplayed(accInfoLink);
	}
	
	
	public void dologinPage(String uname, String pword) 
	{
		//driver.findElement(email).sendKeys(uname);
		//driver.findElement(password).sendKeys(pword);
		//Thread.sleep(3000);
		//driver.findElement(loginButton).click();
		
		eleUtil.doSendKey(email, uname);
		eleUtil.doSendKey(password, pword);
		
		//eleUtil.getBY(unamelocatory, uname);
		//eleUtil.getBY(pword, passwordlocatory);
		eleUtil.doClick(loginButton);
		//return new AccountPage(driver);
		
	}

}
