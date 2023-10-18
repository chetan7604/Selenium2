package ActionsClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_mouseover
{
	public static void main(String[] args) throws InterruptedException 
	{
		
		
	System.setProperty("webdriver.chrome.driver", "G:\\java programme for testing\\New folder\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	   driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		 driver.manage().window().maximize();
		 
    driver.findElement(By.xpath("//span[text()='✕']")).click();
    //mouseover actions
    WebElement Fashion=driver.findElement(By.xpath("(//div[@class='YBLJE4'])[3]"));
    Fashion.click();
    Thread.sleep(3000);
    WebElement Wethnic=driver.findElement(By.xpath("(//a[contains(@href,'/clothing-and-accessories/~c')])[1]"));
    Thread.sleep(3000);
    WebElement EthnicDress = driver.findElement(By.xpath("(//a[@class='_3490ry'])[5]"));
    
    Actions act=new Actions(driver);
    act.moveToElement(Fashion).moveToElement(Wethnic).perform();
    Thread.sleep(2000);
    try
    {
    	act.click(EthnicDress).perform();
    }
    catch (StaleElementReferenceException e) 
    {
    	EthnicDress = driver.findElement(By.xpath("(//a[@class='_3490ry'])[5]"));
    	act.click(EthnicDress).perform();
	}
    Thread.sleep(2000);
    driver.close();
    		
    
    
    

	}
}
