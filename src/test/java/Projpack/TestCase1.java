package Projpack;

import java.io.FileInputStream;
import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;


public class TestCase1 extends BaseClass {

	@Test
	public void tc1() throws IOException
	{
		driver = initiateBrowser();
	
		PageObjectHomePage obj = new PageObjectHomePage(driver);
		obj.getTodayDeals().click();
		log.error("i have logged successfully");
		
	}
	
	@AfterClass
	public void teardown() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.close();
		driver=null;
	}
}
