package test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import base.BaseClass;
import pom.ApplicationHeaderPage;
import pom.LoginPage;
import pom.ReportClass;
import pom.TaskClass;
import pom.UserClass;
import utilpackage.UtilityClass;

public class ActiTime123 extends BaseClass   {
	
	private WebDriver driver;
	private LoginPage l;
	private ApplicationHeaderPage a;
	private TaskClass t;
	private ReportClass r;
	private UserClass u;
	
	@BeforeTest
	@Parameters("browser")
	public void launchBrowser(String browserName) {
		
	if(browserName.equals("chrome")) 
	{
		driver=chromeBrowser();
	}
//	if(browserName.equals("Firefox"))
//	{
//		driver=firefox();
//		
//	}
//	if(browserName.equals("opera"))
//	{
//		driver=operaBrowser();
		
//	}
		
}
	@BeforeClass
	public void beforeClass() {
		 
		l=new LoginPage(driver);
		a=new ApplicationHeaderPage(driver);
		 t= new TaskClass(driver);
		 r=new ReportClass(driver);
		 u=new UserClass(driver);
		 l.mainlogin();
	}
	@BeforeMethod
	public void beforeMethod() {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	@Test(priority = 1)
	public void applicationHeaderpage() throws InterruptedException  {
		a.mainapplication();		
	}
	
	@Test(priority = 2)
	public void task() throws InterruptedException  {
		t.maintask();
	}
	
	@Test(priority = 3)
	public void user() throws InterruptedException  {
		u.usermethod();	
	}
	
	@Test(priority = 4)
	public void report() throws InterruptedException  {
		r.mainreport();		
	}
	
	@AfterMethod
	public void utilityclassmethod() throws EncryptedDocumentException, IOException {
		UtilityClass r=new UtilityClass();
		r.screenshot(driver);
		r.excelsheetdata(driver);
		
		
//		l=null;
//		a=null;
//		t=null;
//		u=null;
//		r=null;
		
	}
	@AfterTest
	public void closeBrowser() {
		driver.quit();
		driver=null;
		System.gc();
	}
}
