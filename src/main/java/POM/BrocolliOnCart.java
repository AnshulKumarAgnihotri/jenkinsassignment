package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseClass.BaseClass;

public class BrocolliOnCart extends BaseClass{
	WebDriver  driver;
    public BrocolliOnCart(WebDriver driver) {
   	PageFactory.initElements(driver,this);
   	this.driver= driver;
}
    @FindBy(xpath="//input[@type='search']")
    public WebElement search_filed;
   
    @FindBy(xpath="//button[@class='search-button']")
    
    public WebElement searchClick_field;
    
    @FindBy(xpath="//a[contains(text(),'+')]")
    public WebElement addQantity_field;
    
    @FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/button[1]")

    public WebElement addtocart_field;
    
    
    public void search()
    {
    	search_filed.sendKeys("brocolli");

    }
    public void searchClick_field()
    {
    	searchClick_field.click();
    	
    }
    public void addTheQantity() {
    	addQantity_field.click();
    }
    public void addtocart_field() throws InterruptedException
    {
    	addtocart_field.click();
    	logger.info("Product added ");
		logger.info("**Exit Brocolli**");
    	Thread.sleep(1000);


    }


}
