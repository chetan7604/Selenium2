package WindowHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebElementHandling
{

	public static void main(String[] args) throws InterruptedException
	{ 
    System.setProperty("webdriver.chrome.driver", "G:\\java programme for testing\\New folder\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://demo.automationtesting.in/Register.html");
	
	Thread.sleep(3000);
	
	driver.manage().window().maximize();
	
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("chetan");
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Bhagat");
	Thread.sleep(2000);
	//enter address
	driver.findElement(By.xpath("//textarea[@rows='3']")).sendKeys("pune");
	Thread.sleep(2000);
	//enter email address
	driver.findElement(By.xpath("//input[@type='email']")).sendKeys("chetanbhagat@gmail.com");
	Thread.sleep(2000);
	//enter mobile no
	driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("8886898384");
	Thread.sleep(2000);
	// select radio button
	driver.findElement(By.xpath("//input[@value='Male']")).click();
	Thread.sleep(2000);
	//select checkboxes
	driver.findElement(By.id("checkbox1")).click();
	driver.findElement(By.id("checkbox3")).click();
	Thread.sleep(2000);
	WebElement Languages = driver.findElement(By.id("msdd"));
	WebElement Lang = driver.findElement(By.xpath("//a[text()='English']"));
	
	Actions act=new Actions(driver);
	Languages.click();
	Thread.sleep(3000);
	act.moveToElement(Lang).click().build().perform();
	driver.findElement(By.xpath("//div[@class='row ']")).click();
	//select from dropdown
	WebElement Skills = driver.findElement(By.id("Skills"));
	Thread.sleep(3000);
	Select s=new Select(Skills);
	System.out.println(s.getOptions().size());
	s.selectByIndex(38);
	Thread.sleep(3000);
	WebElement cout = driver.findElement(By.id("countries"));
	Select s5=new Select(cout);
	s5.selectByIndex(0);
	WebElement country = driver.findElement(By.id("country"));
	Select s1=new Select(country);
	System.out.println(s1.getOptions().size());
	s1.selectByVisibleText("India");
	WebElement Year=driver.findElement(By.id("yearbox"));
	WebElement Month=driver.findElement(By.xpath("(//select[@type='text'])[4]"));
	WebElement Day=driver.findElement(By.id("daybox"));
	Select s2=new Select(Year);
	s2.selectByVisibleText("2015");
	Select s3=new Select(Month);
	s3.selectByIndex(2);
	Select s4=new Select(Day);
	s4.selectByIndex(17);
	Thread.sleep(2000);
	driver.findElement(By.id("firstpassword")).sendKeys("12345678");
	driver.findElement(By.id("secondpassword")).sendKeys("12345678");
	Thread.sleep(2000);
	driver.findElement(By.id("submitbtn")).click();
	Thread.sleep(3000);
	driver.close();
	
	
	
	
	}

}
