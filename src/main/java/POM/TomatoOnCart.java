package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseClass.BaseClass;

public class TomatoOnCart extends BaseClass{
	WebDriver  driver;
    public TomatoOnCart(WebDriver driver) {
   	PageFactory.initElements(driver,this);
   	this.driver= driver;
}
    
    @FindBy(xpath="//header/div[1]/div[2]/form[1]/input[1]")
    WebElement  search_Tomato;
    
    @FindBy(xpath="//button[@Class='search-button']")
    WebElement click_On_search;
    
    @FindBy(xpath="//a[contains(text(),'+')]")
    WebElement add_qantity;
    
    @FindBy(xpath="//button[contains(text(),'ADD TO CART')]")
    WebElement add_to_cart;
    
    public void searchForTomato() throws InterruptedException
    {
    	search_Tomato.sendKeys("Tomato");
    	Thread.sleep(2000);
    }
    public void clickOnSearchButton() throws InterruptedException
	{
    	click_On_search.click();
    	Thread.sleep(2000);
	}
    public void increaseqantity() throws InterruptedException
{
	add_qantity.click();
	Thread.sleep(2000);
}
    public void Add_To_Cart() throws InterruptedException
	{
    	add_to_cart.click();
    	logger.info("Tomato Added");
    	Thread.sleep(2000);
	}


}
