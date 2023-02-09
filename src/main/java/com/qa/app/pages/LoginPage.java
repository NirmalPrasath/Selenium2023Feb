package com.qa.app.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.app.utils.ElementUtil;

public class LoginPage {
	
	private WebDriver driver;
	private ElementUtil eleUtil;
	
	//constructor initialize the driver
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		eleUtil=new ElementUtil(driver);
	}
	
	//By locators
	
	private By registerLink=By.linkText("Register");
	private By email=By.name("email");
	private By password=By.id("input-password");
	private By loginButton=By.xpath("//button[@type='submit']");
	private By forgotPasswordLink=By.xpath("//button[@type='submit']/..//a");
	//By regLink=By.xpath("//div[@class='list-group mb-3']/a[text()='Register']");
	String uname="email";
	String pword="input-password";
	String unamelocatory="name";
	String passwordlocatory="id";
	
	
	//Page Action
	public String getLoginPageTitle()
	{
		
		return eleUtil.getTitle();
		
		//return eleUtil.doIsdisplayed(locator)
	}
	
	public String getPageUrl()
	{
		//String url=driver.getCurrentUrl();
		//return url;
		return eleUtil.getuRL();
		
	}
	
	public boolean isForgotPasswordLinkExist()
	{
		//return driver.findElement(forgotPasswordLink).isDisplayed();
		
		return eleUtil.doIsdisplayed(forgotPasswordLink);
	}
	
	public boolean isRegisterLinkExist()
	{
		//return driver.findElement(registerLink).isDisplayed();
		return eleUtil.doIsdisplayed(registerLink);
	}
	
	public AccountPage dologinPage(String uname, String pword) 
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
		return new AccountPage(driver);
		
	}
	
	public RegisterPage gotoRegistrationPage() throws InterruptedException
	{
		Thread.sleep(100);
		eleUtil.doClick(registerLink);
		return new RegisterPage(driver);
	}

}
