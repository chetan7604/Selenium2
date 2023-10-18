package Popups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertWithOptions
{
	public static void main(String[] args) throws InterruptedException 
	{
		
		
	System.setProperty("webdriver.chrome.driver", "G:\\java programme for testing\\New folder\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	   driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		 driver.manage().window().maximize();
		 
   driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']")).click();
    driver.findElement(By.id("CancelTab")).click();
      Alert alt = driver.switchTo().alert();
        System.out.println(alt.getText());
          alt.accept();   //for positive response
          String Exptext="You pressed Ok";
          String Acttext=driver.findElement(By.id("demo")).getText();
          System.out.println(Acttext);
          if(Exptext.equals(Acttext)==true)
          {
        	  System.out.println("test is pass");
          }
          driver.findElement(By.id("CancelTab")).click();   
           alt.dismiss();  //for negative response
             String ExpCanceltext="You Pressed Cancel";
              String Acttxt=driver.findElement(By.id("demo")).getText();
               System.out.println(Acttxt);
            if(ExpCanceltext.equals(Acttxt)==true)
            {
          	  System.out.println("test is pass");
            }
                 driver.close();
		 
	}
}
