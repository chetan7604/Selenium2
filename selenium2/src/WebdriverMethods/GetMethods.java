package WebdriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethods 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "G:\\java programme for testing\\New folder\\chromedriver.exe");
		
        WebDriver driver=new ChromeDriver();
        
        driver.get("https://www.facebook.com");
        Thread.sleep(3000);
        String Titleofpage = driver.getTitle();
        System.out.println(Titleofpage);
        
        System.out.println(driver.getCurrentUrl());
        System.out.println("-------Overall page source--------");
      // System.out.println(driver.getPageSource());
        
         String Name = driver.findElement(By.xpath("//h2[@class='_8eso']")).getText();
        
        System.out.println(Name);
        
        
		
	}

}
