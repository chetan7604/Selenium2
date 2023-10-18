package ActionsClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderHandling
{
	public static void main(String[] args) throws InterruptedException 
	{
		
		
	System.setProperty("webdriver.chrome.driver", "G:\\java programme for testing\\New folder\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	   driver.get("https://jqueryui.com/slider/");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		 driver.manage().window().maximize();
		 WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		 
		 driver.switchTo().frame(frame);
		 WebElement Slider = driver.findElement(By.xpath("//span[@tabindex='0']"));
		 
		 Actions act=new Actions(driver);
		 act.moveToElement(Slider).dragAndDropBy(Slider, 100, 0).build().perform();
		 driver.switchTo().parentFrame();
		 driver.findElement(By.linkText("Draggable")).click();
		 
	}

}
