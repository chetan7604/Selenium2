package WebdriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalMethods 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "G:\\java programme for testing\\New folder\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		Thread.sleep(3000);
		WebElement NameField = driver.findElement(By.xpath("//input[@name='firstname']"));
		System.out.println(NameField.isDisplayed());
		System.out.println(NameField.isEnabled());
		Thread.sleep(3000);
		WebElement Gender=driver.findElement(By.xpath("//input[@type='radio']"));
		System.out.println(Gender.isSelected());
		Gender.click();
		Thread.sleep(3000);
		System.out.println(Gender.isSelected());
		Thread.sleep(3000);
		driver.close();
		
		
		
	}

}
