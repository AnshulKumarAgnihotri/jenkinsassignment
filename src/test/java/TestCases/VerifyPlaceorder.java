package TestCases;

import org.testng.annotations.Test;

import BaseClass.BaseClass;
import POM.Placeorder;
import POM.DryFruitsOnCart;
import POM.FruitOnCart;
public class VerifyPlaceorder extends BaseClass {
	@Test(priority = 7, groups = { "sanity", "invalid" })

	public void ItemPrice() throws InterruptedException {
		VerifyDryFruitOnCart adf1 = new VerifyDryFruitOnCart();
		adf1.Dryfruits();
		Placeorder ip = new Placeorder(driver);

		ip.itemprice();
		ip.ProeedToCheckout();
		ip.PlaceOrder();
		ip.Choose_Country();
		ip.TermAndCondition();
		ip.Proceed();

	}

}
