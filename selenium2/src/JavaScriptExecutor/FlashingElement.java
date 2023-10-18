package JavaScriptExecutor;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlashingElement
{
	public static void main(String[] args) throws InterruptedException 
	{
		
		
	System.setProperty("webdriver.chrome.driver", "G:\\java programme for testing\\New folder\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	   driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//span[text()='✕']")).click();
		WebElement contactUs = driver.findElement(By.className("HlWMPX"));
		//Scroll into view
		JavaScriptUtil.scrollIntoView(contactUs, driver);
		Thread.sleep(2000);
		// Flashing element
		JavaScriptUtil.flash(contactUs, driver);
		//Highlighting element/draw border
		JavaScriptUtil.drawBorder(contactUs, driver);
		
		//Get title
		String Title = JavaScriptUtil.getTitleByJS(driver);
		System.out.println(Title);
		
		//click element
		JavaScriptUtil.clickElementByJS(contactUs, driver);
		Thread.sleep(3000);
		//create alert
		JavaScriptUtil.generateAlert(driver, "YOU click on contactUs...");
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		//REFRESH BROWSER
		JavaScriptUtil.refreshBrowserByJS(driver);
		Thread.sleep(3000);
		//Get innertext of page
	    String INNERTEXT = JavaScriptUtil.getPageInnerText(driver);
	    System.out.println(INNERTEXT);
		Thread.sleep(3000);
		//Scroll down page till end
		JavaScriptUtil.scrollPageDown(driver);
		Thread.sleep(3000);
		driver.close();
		
		
	}

}
