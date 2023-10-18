package POM;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility_class 
{

	public static String gettestdata(int row_index,int cell_index) throws EncryptedDocumentException, IOException
	{
		FileInputStream file=new FileInputStream("C:\\Users\\prati\\OneDrive\\Desktop\\TestData.xlsx");
		Sheet sh=WorkbookFactory.create(file).getSheet("TestData");
		String Value = sh.getRow(row_index).getCell(cell_index).getStringCellValue();
		return Value;
		
	}
	//@Auther:chetan
	//use:capture screenshot of test
	
	public static void capturescreenshot(WebDriver driver,int id) throws IOException
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest=new File("G:\\java programme for testing\\Chetan_may2022\\selenium2\\Sceenshots\\testcase"+id+".jpg");
		FileHandler.copy(src, dest);
		
	}
}
