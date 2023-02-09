package com.qa.app.test;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.app.utils.Constans;

public class AccountPageTest extends BastTest {
	
	/*@BeforeClass
	public void accountPageSetup() 
	{
		accPage=loginPage.dologinPage(prop.getProperty("username"), prop.getProperty("password"));
	}*/
	
	
	@Test(priority=0)
	public void loginTest() throws InterruptedException
	{
		accPage.dologinPage(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@Test(priority=1)
	public void accontPageTitleTest() 
	{
		Assert.assertEquals(accPage.getAccountPageTitle(), Constans.ACCOUNT_PAGE_Title);
		
	}
	
	@Test(priority=2)
	public void accontPageURLTest()
	{
		Assert.assertTrue(accPage.getAccountPageUrl().equals(Constans.ACCOUNT_PAGE_URL));	
	}
	
	@Test(priority=3)
	public void accontPageHeaderTest()
	{
		Assert.assertEquals(accPage.getAccPageHeading(), Constans.ACCOUNT_PAGE_HEADER);
		
	}
	
	@Test(priority=4)
	public void accontInfoLinkTest()
	{
		Assert.assertTrue(accPage.getAccInfoLink());
		
	}
	
	

}
