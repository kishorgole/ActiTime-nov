package utilitypackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Random;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility {
	
	public static WebDriver takeScreenshit(WebDriver driver ,String TestID) throws IOException
	{
		Random r=new Random();
		int i=r.nextInt(20);
		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File destnation =new File("G:\\Amazon screenshot\\kishorAmazon .jpg"+i);
		FileHandler.copy(source, destnation);
		return driver;	
	}
	public static String getExcelData(String sheet , int row , int cell) throws EncryptedDocumentException, IOException
	{
		String path = "C:\\Users\\pc\\Documents\\POIEXCEL.xlsx";
		FileInputStream File = new FileInputStream(path);
		String value = WorkbookFactory.create(File).getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();	
		System.out.println(value);
		return value ;
		
		
	} 

}
