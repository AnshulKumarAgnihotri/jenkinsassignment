package TestCases;

import org.testng.annotations.Test;
import POM.DryFruitsOnCart;
import BaseClass.BaseClass;

public class VerifyDryFruitOnCart extends BaseClass{
	@Test(priority=2,groups={"sanity","invalid"})
	public void  Dryfruits() throws InterruptedException
	{
		Thread.sleep(1000);
		DryFruitsOnCart adf=new DryFruitsOnCart(driver);
		adf.Scroll_Screen();
		adf.Almonds();
		adf.AddToCart_Almomds();
		adf.AddToPista();
		adf.AddToCart_Pista();
		adf.Nuts_Mixture();
		adf.AddToCart_Nuts();
		
	}

}
