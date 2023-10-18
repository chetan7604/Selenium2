package ActionsClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop
{
	public static void main(String[] args) throws InterruptedException 
	{
		
		
	System.setProperty("webdriver.chrome.driver", "G:\\java programme for testing\\New folder\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	   driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		 driver.manage().window().maximize();
		 Actions act=new Actions(driver);
		 WebElement src1 = driver.findElement(By.id("box1"));
		 WebElement Trg1 = driver.findElement(By.id("box101"));
		 
		 WebElement src2 = driver.findElement(By.id("box2"));
		 WebElement Trg2 = driver.findElement(By.id("box102"));
		  
		 WebElement src3 = driver.findElement(By.id("box3"));
		 WebElement Trg3 = driver.findElement(By.id("box103"));
		 
		 WebElement src4 = driver.findElement(By.id("box4"));
		 WebElement Trg4 = driver.findElement(By.id("box104"));
		 
		 WebElement src5 = driver.findElement(By.id("box5"));
		 WebElement Trg5 = driver.findElement(By.id("box105"));
		 
		 WebElement src6 = driver.findElement(By.id("box6"));
		 WebElement Trg6 = driver.findElement(By.id("box106"));
		 
		 WebElement src7 = driver.findElement(By.id("box7"));
		 WebElement Trg7 = driver.findElement(By.id("box107"));
		 
		 act.dragAndDrop(src1, Trg1).perform();
		 
		 act.dragAndDrop(src2, Trg2).perform();
		 
		 act.dragAndDrop(src3, Trg3).perform();
		 
		 act.dragAndDrop(src4, Trg4).perform();
		 
		 act.dragAndDrop(src5, Trg5).perform();
		 
		 act.dragAndDrop(src6, Trg6).perform();
		 
		 act.dragAndDrop(src7, Trg7).perform();
		 Thread.sleep(3000);
		 driver.close();
		 
	}

}
