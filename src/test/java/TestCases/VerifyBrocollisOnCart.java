package TestCases;

import org.testng.annotations.Test;

import BaseClass.BaseClass;
import POM.BrocolliOnCart;

public class VerifyBrocollisOnCart extends BaseClass {
	@Test(priority=1,groups={"sanity","invalid"})
	public void AddBrocolli() throws InterruptedException
	{
		BrocolliOnCart app = new BrocolliOnCart(driver);
		app.search();
		app.searchClick_field();
		app.addTheQantity();
		app.addtocart_field();
	}


}
