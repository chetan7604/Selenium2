package FileDownload;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class Fileupload2 
{
	public static void main(String[] args) throws FindFailed 
	{
		System.setProperty("webdriver.chrome.driver", "G:\\java programme for testing\\New folder\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		   driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
			driver.get("https://demo.automationtesting.in/Register.html");
			WebElement upload = driver.findElement(By.id("imagesrc"));
			Actions act=new Actions(driver);
			act.moveToElement(upload).click().build().perform();
			
			String imagespath="G:\\java programme for testing\\SikuliPHotos";
			String inputimage="G:\\java programme for testing\\SikuliPHotos";
			
	        Pattern Inputtextbox=new Pattern(imagespath+"\\capture3.PNG");
	        Pattern openbutton=new Pattern(imagespath+"\\capture2.PNG");
	        Screen s=new Screen();
	        s.wait(Inputtextbox, 20);
	        s.type(Inputtextbox, inputimage+"\\nature.jpg");
	        s.click(openbutton);
	        
			
	}

}
