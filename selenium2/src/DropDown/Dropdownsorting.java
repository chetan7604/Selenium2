package DropDown;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdownsorting 
{
	public static void main(String[] args) throws InterruptedException 
	{
        System.setProperty("webdriver.chrome.driver", "G:\\java programme for testing\\New folder\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		Thread.sleep(5000);
		
		WebElement Month = driver.findElement(By.id("month"));
		Select s=new Select(Month);
		
		List OriginalList=new ArrayList<>();
		List<WebElement> options = s.getOptions();
		
		for(WebElement option:options)
		{
			OriginalList.add(option.getText());
		}
		System.out.println("Original list before sorting:- "+OriginalList);
		List TempList=new ArrayList<>();
		TempList=OriginalList;
		System.out.println("Temp list before sorting:- "+TempList);
		
		Collections.sort(TempList);
		System.out.println("Original list after sorting:- "+OriginalList);
		System.out.println("Temp list after sorting:- "+TempList);
		
		if(TempList==OriginalList)
		{
			System.out.println("Dropdown is sorted");
		}
		else
		{
			System.out.println("Dropdown is not sorted");
		}
		
		driver.close();
	}

}
