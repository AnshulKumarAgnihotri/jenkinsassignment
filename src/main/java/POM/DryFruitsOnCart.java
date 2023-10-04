package POM;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseClass.BaseClass;

public class DryFruitsOnCart extends BaseClass {
	WebDriver  driver;
    public DryFruitsOnCart(WebDriver driver) {
   	PageFactory.initElements(driver,this);
   	this.driver= driver;
}
    @FindBy(xpath="//body/div[@id='root']/div[1]/div[1]/div[1]/div[26]/div[2]/a[2]")
    WebElement Add_Almonds;
    
    @FindBy(xpath="//body/div[@id='root']/div[1]/div[1]/div[1]/div[26]/div[3]/button[1]")
    WebElement AddToCart_Almonds;
    
    @FindBy(xpath="//body/div[@id='root']/div[1]/div[1]/div[1]/div[27]/div[2]/a[2]")
    WebElement Add_Pista;
    
    @FindBy(xpath="//body/div[@id='root']/div[1]/div[1]/div[1]/div[27]/div[3]/button[1]")
    WebElement AddToCart_Pista;
    
    @FindBy(xpath="//body/div[@id='root']/div[1]/div[1]/div[1]/div[28]/div[2]/a[2]")
    WebElement Add_NutsMixture;
    
    @FindBy(xpath="//body/div[@id='root']/div[1]/div[1]/div[1]/div[28]/div[3]/button[1]")
    WebElement AddToCart_Nuts;
    
    public void Scroll_Screen() throws InterruptedException{
    	JavascriptExecutor js =  (JavascriptExecutor) driver;
    	js.executeScript("window.scrollBy(0,2300)");
    	Thread.sleep(2000);
		logger.info("Scrolling The Screen");

    }
    public void Almonds()
    {
    	Add_Almonds.click();
    }
    public void AddToCart_Almomds() 
    {
    	AddToCart_Almonds.click();
		
    }
    public void AddToPista() {
    	
    	Add_Pista.click();
    	Add_Pista.click();

    }
    public void AddToCart_Pista()
    {
    	AddToCart_Pista.click();
    }
    public void Nuts_Mixture()
    {
    	Add_NutsMixture.click();
    	Add_NutsMixture.click();
    	Add_NutsMixture.click();
    }
	public void AddToCart_Nuts() throws InterruptedException
	{
		AddToCart_Nuts.click();
		logger.info("Dry Fruits Add successfully");
		logger.info("**Exit DryFruits**");
		Thread.sleep(1000);

	}

}
