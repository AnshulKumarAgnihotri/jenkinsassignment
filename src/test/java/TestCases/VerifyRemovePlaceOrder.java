package TestCases;

import org.testng.annotations.Test;

import BaseClass.BaseClass;
import POM.RemovePlaceOrder;
import TestCases.VerifyFruitsOnCart;

public class VerifyRemovePlaceOrder extends BaseClass {
@Test(priority=8,groups= {"sanity","invalid"})
	
	public void Remove_From_ItemPrice() throws InterruptedException
	{
	VerifyFruitsOnCart af1 = new VerifyFruitsOnCart();
		af1.AddFruits();
		RemovePlaceOrder rp=new RemovePlaceOrder(driver);
		rp.Hometext();
		rp.item_Price_List();
		rp.romove_item();
		rp.checkout();
		rp.Invalid_Coupon_Code();
		rp.apply();
		rp.order_placed();
		rp.Select_country();
		rp.check_Box();
		rp.proceed();
		rp.Home();
		
		
		
	}

}
