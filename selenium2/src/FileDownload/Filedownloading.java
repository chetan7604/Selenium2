package FileDownload;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Filedownloading
{
	public static void main(String[] args) throws InterruptedException 
	{
		
		
	System.setProperty("webdriver.chrome.driver", "G:\\java programme for testing\\New folder\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	    driver.get("https://demo.automationtesting.in/FileDownload.html");
	    //find locator of textbox
	    driver.findElement(By.id("textbox")).sendKeys("You are so beautiful");
	    //generate file 
	    driver.findElement(By.id("createTxt")).click();
	    Thread.sleep(3000);
	    //for downloading file
	    driver.findElement(By.id("link-to-download")).click();
	    Thread.sleep(2000);
	    driver.close();
	    	
	    }

}
