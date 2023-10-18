package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookHomepage 
{
	@FindBy(xpath="(//div[@role='button'])[3]")private WebElement USERLOGO;
	@FindBy(xpath="//span[text()='Er Chetan Mandlik']")private WebElement USERID;
	@FindBy(xpath="//span[text()='Log out']")private WebElement LOGOUT;
	
	
	public FacebookHomepage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void click_userlogo()
	{
		USERLOGO.click();
	}
	
	public String getHomepageuserid()
	{
		String actui=USERID.getText();
		return actui;
	}
	
	public void verify_userid()
	{
		String expui="Er Chetan Mandlik";
		String actui=USERID.getText();
		
		if(actui.equals(expui))
		{
			System.out.println("test is pass");
		}
		else
		{
			System.out.println("test is fail");
		}
	}
	
	public void verify_userid(String expui)
	{
		String actui=USERID.getText();
//		System.out.println(actui);
		
		if(actui.equals(expui))
		{
			System.out.println("test is pass");
		}
		else
		{
			System.out.println("test is fail");
		}
	}
	
	public void logout() throws InterruptedException
	{
		Thread.sleep(3000);
		LOGOUT.click();
	}
	

}
