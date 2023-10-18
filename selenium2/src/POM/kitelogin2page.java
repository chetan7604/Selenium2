package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class kitelogin2page
{
	// regular class
	
	//declaration
	
	@FindBy(xpath = "//input[@id='pin']") private WebElement pin;
	@FindBy(xpath = "//button[@type='submit']") private WebElement continuebtn;
	
	
	//intialization
	
	public kitelogin2page(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	//usage
	
	public void enter_pin()
	{
		pin.sendKeys("240621");
	}
	
	public void continuebtn()
	{
		continuebtn.click();
	}

}
