package POM_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookPage1
{
	@FindBy(id="email")private WebElement EMAILID;
	@FindBy(id="pass")private WebElement PASSWORD;
	@FindBy(name="login")private WebElement LOGIN;
	
	FacebookPage1(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void enterEmailID(String email)
	{
		EMAILID.sendKeys(email);
	}
	
	public void enterPassword(String pass)
	{
		PASSWORD.sendKeys(pass);
	}
	
	public void Clickonloginbtn()
	{
		LOGIN.click();
	}

}
