package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class kitelogin_homepage 
{
	@FindBy(xpath = "//span[text()='TR3583']") private WebElement USER_id;
	
	
	public kitelogin_homepage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void verifyuserid()
	{
		String expected_ui = "TR3583";
		String actual_ui = USER_id.getText();
		
		if(actual_ui.equals(expected_ui))
		{
			System.out.println("test is pass");
		}
		else
		{
			System.out.println("test is failed");
		}
	}

}

