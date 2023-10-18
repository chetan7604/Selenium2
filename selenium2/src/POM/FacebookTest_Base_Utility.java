package POM;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.sl.usermodel.Sheet;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class FacebookTest_Base_Utility extends Base_class
{
	Sheet sh;
	FacebookLogin1 f1;
	FacebookHomepage h;
	
	@BeforeClass
	public void openbrowser()
	{
		Reporter.log("----open browser----",true);
		initialize_browser();
		f1=new FacebookLogin1(driver);
		h=new FacebookHomepage(driver);
	}
	
	@BeforeMethod
	public void loginToApplication() throws EncryptedDocumentException, IOException
	{
		Reporter.log("---login to application---",true);
		f1.enter_email_id(Utility_class.gettestdata(0, 0));
		f1.enter_password(Utility_class.gettestdata(0, 1));
		f1.click_login();
		h.click_userlogo();
	}
	
	@Test
	public void verify_username() throws EncryptedDocumentException, IOException
	{
		int TCID=1002;
		Reporter.log("---Verify username from homepage---",true);
		String ActUI=h.getHomepageuserid();
		String ExpUI=Utility_class.gettestdata(0, 2);
		Assert.assertEquals(ActUI, ExpUI,"both result are differnt");
		
		Utility_class.capturescreenshot(driver, TCID);
		ExtentHtmlReporter reporter=new ExtentHtmlReporter("G:\\java programme for testing\\Chetan_may2022\\selenium2\\Report\\report01.html");
		ExtentReports extent=new ExtentReports();
		extent.attachReporter(reporter);
		ExtentTest logger=extent.createTest("Verify Facebook userid");
		logger.log(Status.INFO, "login to facebook");
		logger.log(Status.PASS, "verify login");
		extent.flush();
			
	}
	
	@AfterMethod
	public void logoutFromApplication() throws InterruptedException
	{
		Reporter.log("---logout from application",true);
		h.logout();
	}
	
	@AfterClass
	public void closeBrowser() throws InterruptedException
	{
		Reporter.log("---close browser---",true);
		closing_browser();
		f1=null;
		h=null;
	}
	
}
