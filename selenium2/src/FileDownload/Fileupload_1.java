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

public class Fileupload_1 
{
	public static void main(String[] args) throws InterruptedException, FindFailed 
	{
		
		
	System.setProperty("webdriver.chrome.driver", "G:\\java programme for testing\\New folder\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	   driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("https://ps.uci.edu/~franklin/doc/file_upload.html");
		Thread.sleep(2000);
		WebElement upload=driver.findElement(By.xpath("//input[@type='file']"));
		Actions act=new Actions(driver);
		Thread.sleep(2000);
		act.moveToElement(upload).click().build().perform();
		
		String imagesfilepath = "G:\\java programme for testing\\SikuliPHotos";
		String inputfile = "G:\\java programme for testing\\SikuliPHotos";
		
		Screen s=new Screen();
		
		Pattern Fileinputtextbox=new Pattern(imagesfilepath+"\\Capture3.PNG");
		Pattern openbutton=new Pattern(imagesfilepath+"\\Capture2.PNG");
		
		s.wait(Fileinputtextbox,20);
		s.type(Fileinputtextbox,inputfile+"\\nature.jpg");
		Thread.sleep(3000);
		s.click(openbutton);
//		driver.close();
		
		
	}

}
