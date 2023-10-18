package POM_DDF;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.sl.usermodel.Sheet;
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
import com.aventstack.extentreports.reporter.converters.ExtentHtmlReporterConverter;

public class FacebookTestclass extends Base_class
{
	Sheet sh;
	FacebookPage1 f1;
	FacebookHomepage h1;
	
	@BeforeClass
	public void openbrowser()
	{
		Reporter.log("-----browser open-----", true);
		initialize_browser();
		f1=new FacebookPage1(driver);
		h1=new FacebookHomepage(driver);
	}
	
	@BeforeMethod
	public void logintoapplication() throws EncryptedDocumentException, IOException
	{
		Reporter.log("-----login to application-----", true);
		f1.enterEmailID(Utility_class.gettestdata(0, 0));
		f1.enterPassword(Utility_class.gettestdata(0, 1));
		f1.Clickonloginbtn();
		h1.clickonlogo();
	}
	
	@Test
	public void verifyfacebooklogin() throws EncryptedDocumentException, IOException, InterruptedException
	{
		int TCID=1001;
		Reporter.log("---verify username from facebook---");
		String actid=h1.getHomepageuserid();
		String expid=Utility_class.gettestdata(0, 2);
		Assert.assertEquals(expid,actid,"both result are differnt");
		Thread.sleep(3000);
		Utility_class.capturescreenshot(driver, TCID);
//         ExtentHtmlReporter reporter=new ExtentHtmlReporter("G:\\java programme for testing\\Chetan_may2022\\selenium2\\Report\\Facebookreport1.html");
//		 ExtentReports extent=new ExtentReports();
//		 extent.attachReporter(reporter);
//		 ExtentTest logger=extent.createTest("verify facebook username");
//		 logger.log(Status.INFO	, "login to facebook");
//		 logger.log(Status.PASS	, "user name verify");
//		 extent.flush();
		
		 ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("G://java programme for testing//Chetan_may2022//selenium2//Report//Facebookreport1.html");
	        ExtentReports extent = new ExtentReports();
	        extent.attachReporter(htmlReporter);
	        ExtentTest test = extent.createTest("verify facebook username");
	        test.log(Status.INFO, "login to facebook");
	        test.log(Status.PASS, "user name verify");
	        extent.flush();
	}
	
	@AfterMethod
	public void logoutFromApplication()
	{
		Reporter.log("---logout from application",true);
		h1.logout();
	}
	
	@AfterClass
	public void closeBrowser() throws InterruptedException
	{
		Reporter.log("---close browser---",true);
		closing_browser();
		f1=null;
		h1=null;
	}
	

}
