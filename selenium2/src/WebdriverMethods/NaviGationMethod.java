package WebdriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NaviGationMethod 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "G:\\java programme for testing\\New folder\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		
		driver.navigate().to("https://www.google.com");
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		driver.navigate().back();
		System.out.println(driver.getTitle());
        Thread.sleep(3000);
		driver.navigate().forward();
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.close();
		
	}

}
