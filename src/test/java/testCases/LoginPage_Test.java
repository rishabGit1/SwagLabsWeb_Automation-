package testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.TestBase;
import pages.LoginPage;

public class LoginPage_Test extends TestBase
{
	
	
	LoginPage login;
	@BeforeMethod
	public void setUp() throws IOException, InterruptedException
	{
		initialization();
		login= new LoginPage();
		
		
	}
	 @Test
	 public void loginToAppTest() throws IOException, InterruptedException
	  {
	    login.loginToApp();
	    String expURL = "https://www.saucedemo.com/inventory.html";
	    String actURL = login.verifyURLofWebsite();
	    Assert.assertEquals(expURL, actURL);
	    Reporter.log("Login Successful = " + actURL);
	  }
	
	
	
	
	@Test
	public void verifyURLofWebsiteTest() throws InterruptedException
	{
		String expURL = "https://www.saucedemo.com/";
		String actURL = login.verifyURLofWebsite();
		Assert.assertEquals(expURL, actURL);
		Reporter.log("URL of website = " + actURL);
		
	}
	@Test
	public void verifyTitleofWebsite()
	{
		String expTitle = "Swag Labs";
		String actTitle = login.verifyTitleofWebsite();
		Assert.assertEquals(expTitle, actTitle);
		Reporter.log("Title of website = " + actTitle);
	}
	
	
	
	@AfterMethod
	public void closeBrowser() 
	{
		driver.close();
	}
	
	
}
