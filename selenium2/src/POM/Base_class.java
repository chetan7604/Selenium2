package POM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Base_class 
{
	WebDriver driver;
	
	//@Auther:chetan
	//use:to open browser/application
	public void initialize_browser()
	{
		   ChromeOptions option=new ChromeOptions();
		   
			  option.addArguments("--disable-notifications");
			
	        System.setProperty("webdriver.chrome.driver", "G:\\java programme for testing\\New folder\\chromedriver.exe");
			driver=new ChromeDriver(option);
			driver.get("https://www.facebook.com/");
//			driver.get("https://kite.zerodha.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
	}
	
	//@Auther:chetan
	//use:to close browser/application
	
	public void closing_browser() throws InterruptedException
	{
		
		driver.close();
	}

}
