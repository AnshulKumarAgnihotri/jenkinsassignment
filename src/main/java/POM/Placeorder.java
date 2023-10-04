package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseClass.BaseClass;

public class Placeorder extends BaseClass{
	WebDriver  driver;
    public Placeorder(WebDriver driver) {
   	PageFactory.initElements(driver,this);
   	this.driver= driver;
}
    @FindBy(xpath="//header/div[1]/div[3]/a[4]/img[1]")
    WebElement click_ItemPrice;
    
    @FindBy(xpath="//button[contains(text(),'PROCEED TO CHECKOUT')]")
    WebElement PROCEED_TO_CHECKOUT;
    
    @FindBy(xpath="//button[contains(text(),'Place Order')]")
    WebElement Place_Order;
    
    @FindBy(xpath="//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[1]/select[1]")
    WebElement Choose_Country;
    
    @FindBy(xpath="//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/input[1]")
    WebElement Term_And_Condition;
    
    @FindBy(xpath="//button[contains(text(),'Proceed')]")
    WebElement Proceed;
    
    public void itemprice()
    {
    	click_ItemPrice.click();
    }
	public void ProeedToCheckout() throws InterruptedException
	{
		PROCEED_TO_CHECKOUT.click();
		Thread.sleep(2000);
	}
	public void PlaceOrder()
	{
		Place_Order.click();
	}
	public void Choose_Country()
	{
		Choose_Country.sendKeys("India");
	}
	public void TermAndCondition() throws InterruptedException
	{
		Term_And_Condition.click();
		Thread.sleep(1000);
	}
	public void Proceed() throws InterruptedException
	{
		Proceed.click();
		Thread.sleep(5000);
	}

}
