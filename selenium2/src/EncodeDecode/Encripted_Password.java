package EncodeDecode;

import org.apache.commons.codec.binary.Base64;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Encripted_Password 
{
	public static void main (String []args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "G:\\java programme for testing\\New folder\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		   driver.get("https://www.facebook.com/");
		   driver.findElement(By.id("email")).sendKeys("9767812005");
		   Thread.sleep(2000);
		   driver.findElement(By.id("pass")).sendKeys(decodestring("[B@378bf509"));
		   driver.findElement(By.name("login")).click();
		   //driver.close();
		  
	}
	
	public static String decodestring(String pass)
	{
		byte[] decodedstring = Base64.decodeBase64(pass);
		return(new String(decodedstring));
		
	}
	
}
