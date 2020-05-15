package Projpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageObjectHomePage {

	WebDriver driver;
	
	public PageObjectHomePage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	By TodayDeals = By.linkText("Today's Deals");
	
	public WebElement getTodayDeals()
	{
		return driver.findElement(TodayDeals);
		
	}
	
}
