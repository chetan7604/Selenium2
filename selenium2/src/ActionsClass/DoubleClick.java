package ActionsClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick 
{
	public static void main(String[] args) throws InterruptedException 
	{
		
		
	System.setProperty("webdriver.chrome.driver", "G:\\java programme for testing\\New folder\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	   driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		 driver.manage().window().maximize();
		 WebElement Button = driver.findElement(By.xpath("//button[@ondblclick='myFunction()']"));
		 Actions act=new Actions(driver);
		 //Doubleclick action perform
		 act.doubleClick(Button).perform();
		 Thread.sleep(2000);
		 Alert alt = driver.switchTo().alert();
		 System.out.println(alt.getText());
		 alt.accept();
		 Thread.sleep(2000);
		 
		 //contextclick or mouse wright click action
		 WebElement btn=driver.findElement(By.xpath("//span[text()='right click me']"));
		 act.contextClick(btn).perform();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//span[text()='Paste']")).click();
		 Alert alt1 = driver.switchTo().alert();
		 Thread.sleep(2000);
		 System.out.println(alt1.getText());
		 alt1.accept();
		 driver.close();
		 
	
	
	
	}
}
