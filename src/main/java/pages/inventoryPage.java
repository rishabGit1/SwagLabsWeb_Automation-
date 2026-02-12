package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import base.TestBase;

public class inventoryPage extends TestBase
{

	//create Object repository
	
	//@FindBy(xpath = "//span[text()='Products']") private WebElement PageTitle;
	@FindBy(xpath = "//span[@class='title']") private WebElement PageTitle;
	@FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-backpack']") private WebElement backpackProduct;
	
	
	@FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']") private WebElement boltTshirt;
	//@FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-bike-light']")private WebElement bikeLightProduct;
    @FindBy(xpath = "//select[@class='product_sort_container']")private WebElement dropdown;
    @FindBy(xpath = "//span[@class='shopping_cart_badge']") private WebElement cartCount;

    public inventoryPage()
    {
    	PageFactory.initElements(driver, this);
    }
    
    public String verifyPageTitle()
    {
		return PageTitle.getText();
    	
    }
    
    public String addProductToCart() throws InterruptedException
    {
    	
    	Select sc = new Select(dropdown);
    	sc.selectByVisibleText("Name (A to Z)");
    	boltTshirt.click();
    	backpackProduct.click();
    	Thread.sleep(3000);
    	
    	
    	//bikeLightProduct.click();
    	
		return cartCount.getText();
    	
    }
    
    //new method for delete products
    
    
    

}

