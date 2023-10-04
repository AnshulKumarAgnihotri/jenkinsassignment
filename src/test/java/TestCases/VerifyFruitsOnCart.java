package TestCases;

import org.testng.annotations.Test;

import BaseClass.BaseClass;
import POM.FruitOnCart;

public class VerifyFruitsOnCart extends BaseClass {
	@Test(priority=3,groups={"sanity","invalid"})
	public void AddFruits() throws InterruptedException
	{
		Thread.sleep(1000);
		FruitOnCart af=new FruitOnCart(driver);
	
		af.Scroll_Page();
		af.AddGrapes();
		af.AddToCart_Grapes();
		af.AddMango();
		af.AddToCart_Mango();
		af.Orange();
		af.AddToCart_Orange();
		
	}

}
