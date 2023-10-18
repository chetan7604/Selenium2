package FileDownload;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;

import com.tigervnc.rfb.Screen;

public class FileUpload 
{
	public static void main(String[] args) throws InterruptedException, FindFailed 
	{
		
		
	System.setProperty("webdriver.chrome.driver", "G:\\java programme for testing\\New folder\\chromedriver.exe");
	 
	    WebDriver driver=new ChromeDriver();
	   
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		 driver.manage().window().maximize();
		 driver.get("https://demo.automationtesting.in/FileUpload.html");
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//div[@class='btn btn-primary btn-file']")).click();
		 String imagesFilepath="G:\\java programme for testing\\SikuliPHotos";
		 String inputFilepath="G:\\java programme for testing\\SikuliPHotos";
		 org.sikuli.script.Screen s=new org.sikuli.script.Screen();
		 
		Pattern Fileinputtextbox=new Pattern(imagesFilepath+"\\Capture3.PNG");
		Pattern openbutton=new Pattern(imagesFilepath+"\\Capture2.PNG");
		 
		 Thread.sleep(5000);
		 s.wait(Fileinputtextbox, 20);
		 s.type(Fileinputtextbox, inputFilepath+"\\nature.jpg");
		 Thread.sleep(3000);
		 s.click(openbutton);
		 Thread.sleep(5000);
		 WebElement rbtn = driver.findElement(By.xpath("//span[text()='Upload']"));
		 if(rbtn.isEnabled())
		 {
			 rbtn.click();
		 }
		 
//		 driver.close();
		 
		 
	}

}
