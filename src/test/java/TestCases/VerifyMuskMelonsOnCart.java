package TestCases;

import org.testng.annotations.Test;

import BaseClass.BaseClass;
import POM.MuskMelonOnCart;

public class VerifyMuskMelonsOnCart extends BaseClass {
@Test(priority=4,groups= {"sanity","invalid"})
	
	public void Add_MuskMelon() throws InterruptedException
	{
	MuskMelonOnCart mp=new MuskMelonOnCart(driver);
		mp.searchForMuskMelon("Musk Melon");
		mp.button();
		mp.add_quantity();
		mp.decrease_quantity();
		mp.Added();
		logger.info("Musk Melon Added");
	}

}
