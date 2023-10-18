package POM;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.PropertyConfigurator;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.jcraft.jsch.Logger;

public class FacebookTest_DDF 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException 
	{
		FileInputStream file=new FileInputStream("C:\\Users\\prati\\OneDrive\\Desktop\\Book1.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet4");
		org.apache.log4j.Logger logger=org.apache.log4j.Logger.getLogger("FacebookTest_DDF");
		PropertyConfigurator.configure("log4j.properties");
		System.setProperty("webdriver.chrome.driver", "G:\\java programme for testing\\New folder\\chromedriver.exe");
		  ChromeOptions option=new ChromeOptions();
		   option.addArguments("--disable-notifications");
		   WebDriver driver=new ChromeDriver(option);
		   driver.manage().window().maximize();
		   logger.info("open browser");
		   driver.get("https://www.facebook.com/");
		   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		   logger.info("login into facebook");
		   FacebookLogin f1=new FacebookLogin(driver);
		   f1.enter_email(sh.getRow(0).getCell(0).getStringCellValue());
		   f1.enter_password(sh.getRow(0).getCell(1).getStringCellValue());
		   f1.click_login();
		   logger.info("verify username");
		   FacebookHomepage h=new FacebookHomepage(driver);
		   h.click_userlogo();
		   h.verify_userid(sh.getRow(0).getCell(2).getStringCellValue());
		   Thread.sleep(2000);
		   logger.info("logout from facebook");
		   h.logout();
		   Thread.sleep(4000);
		   logger.info("closing browser");
		   driver.close();
		   
		
	}

}
