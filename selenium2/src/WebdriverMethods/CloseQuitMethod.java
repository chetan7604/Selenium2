package WebdriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseQuitMethod 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "G:\\java programme for testing\\New folder\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Windows.html");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='    click   ']")).click();
		Thread.sleep(2000);
		//driver.close();
		driver.quit();
		
	}
	

}
