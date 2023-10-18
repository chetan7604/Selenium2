package DropDown;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownHandling 
{
	public static void main(String[] args) throws InterruptedException 
	{
        System.setProperty("webdriver.chrome.driver", "G:\\java programme for testing\\New folder\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		
		WebElement Country = driver.findElement(By.id("country"));
		
		Select s=new Select(Country);
		
		List originalList=new ArrayList<>();
		
		List<WebElement>options=s.getOptions();
		for(WebElement option:options) 
		{
			originalList.add(option.getText());
		}
		System.out.println(originalList);
		
		List TempList=new ArrayList<>();
		TempList=originalList;
		System.out.println("before sorting:- "+TempList);
		Collections.sort(TempList);
		System.out.println("After sorting:- "+TempList);
		
		if(TempList==originalList)
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
