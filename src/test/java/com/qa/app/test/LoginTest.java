package com.qa.app.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.app.utils.Constans;

public class LoginTest extends BastTest {
	
	
	
	@Test(priority=4)
	public void loginPageTitleTest()
	{
			String actualTitle=loginPage.getLoginPageTitle();
			
			System.out.println("Page Title: "+ actualTitle);
			
			Assert.assertEquals(actualTitle, Constans.Login_Page_Title, "Ttitle is invalid");
	}
	
	@Test(priority=1)
	public void loginPageURLTest()
	{
		String url=loginPage.getPageUrl();
		
		System.out.println("Page URL: "+ url);
		Assert.assertTrue(url.contains(Constans.Login_Page_URL));
	}
	
	@Test(priority=2)
	public void isRegisterlinkExitTest()
	{
		boolean regLink=loginPage.isRegisterLinkExist();
		System.out.println("Register Link: "+ regLink);
		Assert.assertTrue(regLink);
	}
	
	@Test(priority=3)
	public void isForgotPasswordlinkExitTest()
	{
		boolean forgotPasswordLink=loginPage.isForgotPasswordLinkExist();
		System.out.println("Forgot Password Link: "+ forgotPasswordLink);
		Assert.assertTrue(forgotPasswordLink);
	}
	
	@Test(priority=5)
	public void loginTest() throws InterruptedException
	{
		loginPage.dologinPage(prop.getProperty("username"), prop.getProperty("password"));
	}

}
