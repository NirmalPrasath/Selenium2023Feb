package com.qa.app.test;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.app.utils.UtilClass;



public class RegisterTest extends BastTest{
	
	/*@BeforeClass
	public void setUp() throws InterruptedException
	{
		regPage=loginPage.gotoRegistrationPage();
	}*/
	
	
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data=UtilClass.sheetPath("register");
		return data;
	}
	
	@Test
	public void registerTest()
	{
		
		regPage.accRegistration("fname", "lname", "mail", "pWord");
		
	}
	

}
