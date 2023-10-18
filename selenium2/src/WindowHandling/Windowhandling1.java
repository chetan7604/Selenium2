package WindowHandling;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandling1 
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
		ArrayList<String> id=new ArrayList<>(Ids);
		driver.switchTo().window(id.get(1));
		Thread.sleep(2000);
		WebElement text = driver.findElement(By.xpath("//h2[text()='Selenium Level Sponsors']"));
		System.out.println(text.getText());
		driver.switchTo().window(id.get(0));
		Thread.sleep(3000);
		
		
		
		
	}

}
