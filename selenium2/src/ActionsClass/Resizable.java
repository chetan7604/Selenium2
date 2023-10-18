package ActionsClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Resizable
{
	public static void main(String[] args) throws InterruptedException 
	{
		
		
	System.setProperty("webdriver.chrome.driver", "G:\\java programme for testing\\New folder\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	   driver.get("https://jqueryui.com/resizable/");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		 driver.manage().window().maximize();
        WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		 
		 driver.switchTo().frame(frame);
		 WebElement resize = driver.findElement(By.xpath("(//div[contains(@class,'ui-resizable-handle ')])[3]"));
		 Actions act=new Actions(driver);
		 Thread.sleep(3000);
		 act.moveToElement(resize).dragAndDropBy(resize, 70, 70).build().perform();
		 
		 driver.close();
	}

}
