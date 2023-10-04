package TestCases;

import org.testng.annotations.Test;

import BaseClass.BaseClass;
import POM.TomatoOnCart;

public class VerifyTomatosOnCart extends BaseClass {
	@Test(priority=6,groups= {"sanity","invalid"})
	public void add_Tomato() throws InterruptedException
	{
		TomatoOnCart tp=new TomatoOnCart(driver);
		tp.searchForTomato();
		tp.clickOnSearchButton();
		tp.increaseqantity();
		tp.Add_To_Cart();
	}


}
