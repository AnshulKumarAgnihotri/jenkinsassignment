package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import BaseClass.BaseClass;

public class RemovePlaceOrder extends BaseClass {
	WebDriver driver;
	public RemovePlaceOrder(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		this.driver=driver;
	}
	
	@FindBy(xpath="//header/div[1]/div[1]")
	WebElement text;
	
	@FindBy(xpath="//header/div[1]/div[3]/a[4]/img[1]")
	WebElement Item_price;
	@FindBy(xpath="//header/div[1]/div[3]/div[2]/div[1]/div[1]/ul[1]/li[3]/a[1]")
	WebElement remove_Item;
	
	@FindBy(xpath="//button[contains(text(),'PROCEED TO CHECKOUT')]")
	WebElement Checkout;
	
	@FindBy(xpath="//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")
	WebElement Invalid_Code;
	@FindBy(xpath="//button[contains(text(),'Apply')]")
	WebElement Apply;
	
	@FindBy(xpath="//button[contains(text(),'Place Order')]")
	WebElement order_placed;
	@FindBy(xpath="//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[1]/select[1]")
	WebElement Select_Country;
	@FindBy(xpath="//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/input[1]")
	WebElement Click_On_CheckBox;
	@FindBy(xpath="//button[contains(text(),'Proceed')]")
	WebElement proceed;
	@FindBy(xpath="//div[@id='root']")
	WebElement Home;
	
	
	public void Hometext()
	{
		String b = text.getText();
		Assert.assertEquals("GREENKART", b);
	}
	public void item_Price_List() throws InterruptedException
	{
		Item_price.click();
		Thread.sleep(2000);
	}
	public void romove_item() throws InterruptedException
	{
		remove_Item.click();
		Thread.sleep(2000);
	}
	public void checkout()
	{
		Checkout.click();
	}
	public void Invalid_Coupon_Code() throws InterruptedException
	{
		Invalid_Code.sendKeys("AnshulAgnihotri");
		
		
	}
	public void apply() throws InterruptedException
	{
		Apply.click();
		Thread.sleep(10000);
	}
	public void order_placed()
	{
		order_placed.click();
	}
	public void Select_country()
	{
		Select_Country.sendKeys("India");
	}
	public void check_Box()
	{
		Click_On_CheckBox.click();
	}
	public void proceed()
	{
		proceed.click();
	}
	public void Home() throws InterruptedException
	{
		Home.click();
		Thread.sleep(2000);
	}

}
