package POM;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseClass.BaseClass;

public class FruitOnCart extends BaseClass {
	WebDriver  driver;
    public FruitOnCart(WebDriver driver) {
   	PageFactory.initElements(driver,this);
   	this.driver= driver;
}
    @FindBy(xpath="//body/div[@id='root']/div[1]/div[1]/div[1]/div[17]/div[2]/a[2]")
    WebElement Add_Grapes;
    
    @FindBy(xpath="//body/div[@id='root']/div[1]/div[1]/div[1]/div[17]/div[3]/button[1]")
    WebElement AddToCart_Grapes ;
    
    @FindBy(xpath="//body/div[@id='root']/div[1]/div[1]/div[1]/div[18]/div[2]/a[2]")
    WebElement Add_Mango;
    
    @FindBy(xpath="//body/div[@id='root']/div[1]/div[1]/div[1]/div[18]/div[3]/button[1]")
    WebElement AddToCart_Mango;
    
    @FindBy(xpath="//body/div[@id='root']/div[1]/div[1]/div[1]/div[20]/div[2]/a[2]")
    WebElement Add_Orange;
    
    @FindBy(xpath="//body/div[@id='root']/div[1]/div[1]/div[1]/div[20]/div[3]/button[1]")
    WebElement AddToCart_Orange ; 
    
   	public void Scroll_Page() throws InterruptedException
	{
		JavascriptExecutor js =  (JavascriptExecutor) driver;
    	js.executeScript("window.scrollBy(0,1500)");
		logger.info("Scrolling The Screen");
    	Thread.sleep(2000);
	}
	public void AddGrapes()
	{
		Add_Grapes.click();
	}
	public void AddToCart_Grapes()
	{
		AddToCart_Grapes.click();
	}
	public void AddMango()
	{
		Add_Mango.click();
		Add_Mango.click();
	}
	public void AddToCart_Mango()
	{
		AddToCart_Mango.click();
	}
	public void Orange()
	{
		Add_Orange.click();
	}
	public void AddToCart_Orange() throws InterruptedException
	{
		AddToCart_Orange.click();
		logger.info("Fruits Add successfully");
		logger.info("**Exit Fruits**");
		Thread.sleep(2000);
	}

}
