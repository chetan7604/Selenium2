package POM_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookHomepage
{
	@FindBy(xpath="(//div[@role='button'])[3]")private WebElement USERLOGO;
	@FindBy(xpath="//span[text()='Er Chetan Mandlik']")private WebElement USERNAME;
	@FindBy(xpath="//span[text()='Log out']")private WebElement LOGOUT;
	
	FacebookHomepage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickonlogo()
	{
		USERLOGO.click();
	}
	
	public String getHomepageuserid()
	{
		String ACTUI = USERNAME.getText();
		return ACTUI;
	}
	
	/*public void verifyusername(String expui)
	{
		String ACTui=USERNAME.getText();
		
		if(ACTui.equals(expui))
		{
			System.out.println("test is pass");
		}
		else
		{
			System.out.println("test is fail");
		}
	}*/
	
	public void logout()
	{
		LOGOUT.click();
	}

}
