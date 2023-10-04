package TestCases;

import org.testng.annotations.Test;

import BaseClass.BaseClass;
import POM.WalnutsOnCart;

public class VerifyWalnutOnCart extends BaseClass{
	@Test(priority=5,groups= {"sanity","invalid"})
	public void Add_Walnuts() throws InterruptedException
	{
		WalnutsOnCart wp=new WalnutsOnCart(driver);
		wp.Scroll_The_Screen();
		wp.add_walnuts();
		wp.addtocart();
	}

}
