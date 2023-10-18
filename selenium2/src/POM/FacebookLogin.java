package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookLogin 
{
	@FindBy(id="email")private WebElement EmailID;
	@FindBy(id="pass")private WebElement Password;
	@FindBy(name="login")private WebElement Login;
	
	
	public FacebookLogin(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void enter_email()
	{
		EmailID.sendKeys("9767812005");
	}
	
	public void enter_password()
	{
		Password.sendKeys("Qwerty@321");
	}
	
	public void click_login()
	{
		Login.click();
	}
	
	public void enter_email(String email)
	{
		EmailID.sendKeys(email);
	}
	
	public void enter_password(String password)
	{
		Password.sendKeys(password);
	}

}
