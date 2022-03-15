package utilpackage;

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

public class UtilityClass {
	
	public static WebDriver screenshot(WebDriver driver) throws IOException {
		Random r =new Random();
		int x = r.nextInt(10);
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("E:\\operadriver_win64\\kishor123"+ x  +".jpg");
		FileHandler.copy(source, dest);
		return driver;
		
	}
	
	public static String excelsheetdata(WebDriver driver) throws EncryptedDocumentException, IOException {
		String path="C:\\Users\\pc\\Documents\\POIEXCEL.xlsx";
		FileInputStream File =new FileInputStream(path);
		String value =WorkbookFactory.create(File).getSheet("kishor").getRow(4).getCell(2).getStringCellValue();
		System.out.println(value);
		return value;
		
	}

}
