package ActionsClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClick 
{
	public static void main(String[] args) throws InterruptedException 
	{
		
		
	System.setProperty("webdriver.chrome.driver", "G:\\java programme for testing\\New folder\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	   driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		  driver.findElement(By.xpath("//span[text()='✕']")).click();
		 WebElement option = driver.findElement(By.xpath("//img[@class='-dOa_b']"));
		 Actions act=new Actions(driver);
		 act.contextClick(option).perform();
		 Thread.sleep(2000);
		 driver.close();
		 
	}
}
