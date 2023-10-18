package POM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FacebookTest
{
	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "G:\\java programme for testing\\New folder\\chromedriver.exe");
		  ChromeOptions option=new ChromeOptions();
		   option.addArguments("--disable-notifications");
		   WebDriver driver=new ChromeDriver(option);
		   driver.manage().window().maximize();
		   driver.get("https://www.facebook.com/");
		   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		   FacebookLogin F1=new FacebookLogin(driver);
		   F1.enter_email();
		   F1.enter_password();
		   F1.click_login();
		  
		   FacebookHomepage home=new FacebookHomepage(driver);
		   home.click_userlogo();
		   home.verify_userid();
		   Thread.sleep(3000);
		   home.logout();
		   Thread.sleep(3000);
		   driver.close();
		   
		
	}

}
