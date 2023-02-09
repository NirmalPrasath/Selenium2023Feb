package com.qa.app.test;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.qa.app.factory.DriverFactory;
import com.qa.app.pages.AccountPage;
import com.qa.app.pages.LoginPage;
import com.qa.app.pages.RegisterPage;

public class BastTest {
	
	DriverFactory df;
	WebDriver driver;
	Properties prop;
	LoginPage loginPage;
	AccountPage accPage;
	RegisterPage regPage;
	
	@BeforeTest
	public void setup()
	{
		df=new DriverFactory();
		prop=df.initializeProperties();
		driver=df.initializeBrowser(prop);
		//loginPage=new LoginPage(driver);
		accPage=new AccountPage(driver);
	}
	
	@AfterTest
	public void tearDown()
	{
		//driver.quit();
	}
	

}
