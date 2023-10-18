package Popups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertWithTextbox
{
	public static void main(String[] args) throws InterruptedException 
	{
		
		
	System.setProperty("webdriver.chrome.driver", "G:\\java programme for testing\\New folder\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	   driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		 driver.manage().window().maximize();
		 driver.findElement(By.xpath("//a[text()='Alert with Textbox ']")).click();
		 driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
		 Alert alt = driver.switchTo().alert();
		 alt.sendKeys("chetan");
		 alt.accept();
		 System.out.println(driver.findElement(By.id("demo1")).getText());
		 driver.close();
	
	}
}
