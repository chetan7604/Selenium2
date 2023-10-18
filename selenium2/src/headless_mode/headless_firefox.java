package headless_mode;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class headless_firefox 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "G:\\\\java programme for testing\\\\Firefoxdriver\\\\geckodriver.exe");
		
		FirefoxOptions options=new FirefoxOptions();
		options.setHeadless(true);
		
		WebDriver driver=new FirefoxDriver(options);
		
		driver.get("https://www.flipkart.com");
		
		System.out.println(driver.getTitle());
		
		Thread.sleep(3000);
		
		
		
		
	}
	

}
