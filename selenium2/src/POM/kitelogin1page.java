package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class kitelogin1page
{
	// Regular class
	//Declaration
	
	@FindBy(xpath = "//input[@type='text']") private WebElement USERID; // <---convert private WebElement USERID= driver.findElement(By.xpath("//input[@id='userid']"));
	@FindBy(xpath = "//input[@type='password']") private WebElement PWD;
	@FindBy(xpath = "//button[@type='submit']") private WebElement Loginbtn;
	
	// initailization
	
	public kitelogin1page(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
		
	}
	
	// usage
	
	public void enter_user_id()
	{
		USERID.sendKeys("TR3583");

	}
	
	public void enter_pwd()
	{
		PWD.sendKeys("Bhavi@2406");
	}
	
	public void clickloginbtn()
	{
		Loginbtn.click();
	}
	
}
