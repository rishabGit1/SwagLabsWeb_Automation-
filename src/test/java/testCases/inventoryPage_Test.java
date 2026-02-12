package testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.TestBase;
import pages.LoginPage;
import pages.inventoryPage;

public class inventoryPage_Test extends TestBase
{
	LoginPage login;
	inventoryPage invent;
	@BeforeMethod
	public void setUp() throws IOException, InterruptedException
	{
		initialization();
		login= new LoginPage();
		invent = new inventoryPage();
		login.loginToApp();

	}
	
	
	@Test
	public void  verifyPageTitleTest() throws InterruptedException
	{
		String expTitle = "Products";
		String actTitle = invent.verifyPageTitle();
		Assert.assertEquals(expTitle, actTitle);
		Reporter.log("Inventory Page title = " + actTitle);
	}
	
	@Test
	public void addProductToCartTest() throws InterruptedException
	{
		String expCount = "2";
		String actCount = invent.addProductToCart();
		Assert.assertEquals(expCount,actCount);
		Reporter.log("Added product in cart count is = " + actCount);
	}
	
	
	
	@AfterMethod
	public void closeBrowser() 
	{
		driver.close();
	}
	
	
	
}
