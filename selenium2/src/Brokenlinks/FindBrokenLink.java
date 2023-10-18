package Brokenlinks;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindBrokenLink 
{
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		
		
	System.setProperty("webdriver.chrome.driver", "G:\\java programme for testing\\New folder\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  // implicit wait for 10 sec
	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		 driver.manage().window().maximize();
		 //open url
		 driver.get("https://www.google.com/");
		 Thread.sleep(6000);
		 
		 List<WebElement> links = driver.findElements(By.linkText("a"));
		System.out.println( links.size());
		Thread.sleep(2000);
		for(int i=0;i<links.size();i++)
		{
			//by using href attribute we can get url of required link
			WebElement element = links.get(i);
			String url = element.getAttribute("href");
			
			URL link=new URL(url);
			//create connection using url object "link'
			HttpURLConnection httpcon=(HttpURLConnection) link.openConnection();
			Thread.sleep(3000);
			// establish connection
			httpcon.connect();
			//return response code  if res code is above 400: broken
			int rescode = httpcon.getResponseCode();
			if(rescode>400)
			{
				System.out.println(url+" - "+"is broken link");
			}
			else
			{
				System.out.println(url+" - "+"is valid link");
			}
			
			
			Thread.sleep(3000);
			
			
			
		}
		 
	}

}
