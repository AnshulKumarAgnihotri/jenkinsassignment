package Utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import BaseClass.BaseClass;

public class Utils extends BaseClass {
	public void driverSetup()
	{
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\anshulagnihotri\\eclipse-workspace\\Selenium_Assignment\\Driver\\chromedriver.exe");
		
		//Test cases in headless mode
		
		 // boolean HeadlessMode=Boolean.parseBoolean(prop.getProperty("HeadlessMode"));
		 // ChromeOptions options = new ChromeOptions();
		//  options.setHeadless(HeadlessMode); options.addArguments("Headless"); driver =
		//  new ChromeDriver(options);
		 
		
        driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
	}
	
	public void getUrl()
	{
		driver.get(prop.getProperty("url"));
		
	}

}
