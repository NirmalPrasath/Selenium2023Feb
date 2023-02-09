package com.qa.app.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.app.utils.ElementUtil;

public class RegisterPage {
	
	WebDriver driver;
	ElementUtil ele;
	
	public RegisterPage (WebDriver driver)
	
	{
		this.driver=driver;
		ele=new ElementUtil(driver);
	}
	
	
	
	By firstName=By.name("input-firstname");
	By lastName=By.id("input-lastname");
	By email=By.id("input-email");
	By password=By.id("input-password");
	By checkBox=By.xpath("//input[@type='submit']");
	By continueButton=By.xpath("//button[@type='submit']");
	
	public void accRegistration(String firstName1, String lastName1, String email1, String password1)
	{
		
		ele.doSendKey(firstName, firstName1);
		ele.doSendKey(lastName, lastName1);
		ele.doSendKey(email, email1);
		ele.doSendKey(password, password1);
		ele.doClick(checkBox);
		ele.doClick(continueButton);
	}
	
	
	
	

}
