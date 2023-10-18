package Cookies;

import java.util.Set;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cookies_Handling 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "G:\\java programme for testing\\New folder\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		   driver.get("https://www.flipkart.com/");
	        driver.manage().window().maximize();
		Set<Cookie> cookies = driver.manage().getCookies();//capture all cookies from browser
		System.out.println("size of cookies is:-" +cookies.size());// print size of cookies
		
		/*for(Cookie cookie:cookies)
		{
			System.out.println(cookie.getName()+": "+cookie.getValue());//print name and value of cookies
		}*/
		System.out.println(driver.manage().getCookieNamed("fonts-loaded"));//print specific cookie according to the name
		
		Cookie c1=new Cookie("My cookie", "9767812005");//for adding cookie
		driver.manage().addCookie(c1);
		
		cookies = driver.manage().getCookies();
		System.out.println(cookies.size());
		for(Cookie cookie:cookies)
		{
			System.out.println(cookie.getName()+": "+cookie.getValue());//print name and value of cookies
		}
		
		//delete specific cookie
		driver.manage().deleteCookie(c1);
		Thread.sleep(3000);
		cookies = driver.manage().getCookies();//capture all cookies from browser
		System.out.println("size of cookies is:-" +cookies.size());// print size of cookies
		
		
	}

}
