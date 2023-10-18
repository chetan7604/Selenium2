package POM;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class kitelogin_testClass 
{
	public static void main(String[] args) throws InterruptedException 
	{
        System.setProperty("webdriver.chrome.driver", "G:\\java programme for testing\\New folder\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		kitelogin1page lg1=new kitelogin1page(driver);
		lg1.enter_user_id();
		lg1.enter_pwd();
		lg1.clickloginbtn();
		
		Thread.sleep(2000);
		
		kitelogin2page lg2=new kitelogin2page(driver);
		lg2.enter_pin();
		lg2.continuebtn();
		Thread.sleep(2000);
		
		kitelogin_homepage home=new kitelogin_homepage(driver);
		home.verifyuserid();
		
	}

}
