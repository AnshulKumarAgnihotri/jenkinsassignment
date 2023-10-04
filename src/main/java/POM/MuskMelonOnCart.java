package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseClass.BaseClass;

public class MuskMelonOnCart extends BaseClass{
	WebDriver  driver;
    public MuskMelonOnCart(WebDriver driver) {
   	PageFactory.initElements(driver,this);
   	this.driver= driver;
    }
    
    
    
    @FindBy(xpath="//header/div[1]/div[2]/form[1]/input[1]")
    WebElement search;
    
    
    
    @FindBy(xpath="//button[@class='search-button']")
    WebElement button;
    
    
    
    @FindBy(xpath="//a[contains(text(),'+')]")
    WebElement AddMuskMelon;
    
    
    @FindBy(xpath="//a[contains(text(),'–')]")
    WebElement Decrease_Quantity;

    
    @FindBy(xpath="//button[contains(text(),'ADD TO CART')]")
    WebElement Add_To_Cart;
    
    
    public void searchForMuskMelon(String a) throws InterruptedException
    {
    	search.sendKeys(a);
    	Thread.sleep(2000);
    	
    }
    public void button() throws InterruptedException
    {
    	button.click();
    	Thread.sleep(2000);
    }
    public void add_quantity() throws InterruptedException
    {
    	AddMuskMelon.click();
    	Thread.sleep(1000);
    	AddMuskMelon.click();
    	Thread.sleep(1000);
    	AddMuskMelon.click();
    	Thread.sleep(2000);
    }
    public void decrease_quantity() throws InterruptedException
    {
    	Decrease_Quantity.click();
    	Thread.sleep(5000);
    	
    }
    public void Added() throws InterruptedException
    {
    	Add_To_Cart.click();
    	Thread.sleep(2000);
    }
    

}
