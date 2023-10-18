package WindowHandling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandling
{

	public static void main(String[] args) throws InterruptedException
	{
        System.setProperty("webdriver.chrome.driver", "G:\\java programme for testing\\New folder\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Windows.html");
		
		Thread.sleep(3000);
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[@class='analystic']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='    click   ']")).click();
		
		Set<String> Ids = driver.getWindowHandles();
		    
		for(String I:Ids)
		{
			String Title = driver.switchTo().window(I).getTitle();
			System.out.println(Title);
			
			if(Title.contains("Selenium"))
			{
				driver.close();
			}
			
		}
		
		
	}

}
