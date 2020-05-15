package Projpack;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Driver;
import java.util.Properties;
import java.util.logging.LogManager;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;


public class BaseClass {

		
	public static WebDriver driver;
	public static Logger log = Logger.getLogger(BaseClass.class);
public WebDriver initiateBrowser() throws IOException
{

	
	FileInputStream fis2 = new FileInputStream("C:\\Users\\hp\\workspace\\ProjWeekend\\src\\test\\java\\Projpack\\log4j.properties");
	Properties prop2 =new Properties();
	prop2.load(fis2);
	PropertyConfigurator.configure(prop2);
	

	String basepath = System.getProperty("user.dir");
	
	
	FileInputStream fis = new FileInputStream(basepath+"\\src\\test\\java\\Projpack\\datadriver.properties");
	Properties prop = new Properties();
	prop.load(fis);
	
	if(prop.getProperty("browser").equalsIgnoreCase("firefox"))
	{
		System.setProperty("webdriver.gecko.driver","F:\\Sellllllllll\\geckodriver-v0.26.0-win32\\geckodriver.exe"); 
		driver = new FirefoxDriver();
		driver.get(prop.getProperty("url"));

	}
	return driver;
}
public void getScreenshot(String str) throws IOException
{

	
	File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileHandler.copy(src, new File("F://Sellllllllll//Screenshots_saved//"+str+"ss.png"));
	

}

}


