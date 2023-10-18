package headless_mode;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class headless_chrome 
{
	public static void main(String[] args) throws InterruptedException 
	{
        System.setProperty("webdriver.chrome.driver", "G:\\java programme for testing\\New folder\\chromedriver.exe");
		
        ChromeOptions options=new ChromeOptions();
        options.setHeadless(true);
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://www.facebook.com");
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
	}

}
