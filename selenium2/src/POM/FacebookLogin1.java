package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookLogin1 
{
	@FindBy(xpath="//input[@name='email']")private WebElement EmailID;
	@FindBy(xpath="//input[@name='pass']")private WebElement Password;
	@FindBy(xpath="//button[@name='login']")private WebElement Login;
	
	public FacebookLogin1(WebDriver driver)
	{
	PageFactory.initElements(driver, this);
	}

	public void enter_email_id(String email)
	{
		EmailID.sendKeys(email);
	}
	
	public void enter_password(String password)
	{
		Password.sendKeys(password);
	}
	
	public void click_login()
	{
		Login.click();
	}
	
	

}
