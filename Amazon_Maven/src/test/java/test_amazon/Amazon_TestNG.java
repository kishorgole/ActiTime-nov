package test_amazon;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITest;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import basepackage.BaseClassOfAmazon;
import pom_amazon.Account;
import pom_amazon.HeaderPageApplication;
import pom_amazon.Mobile;
import utilitypackage.Utility;

public class Amazon_TestNG extends BaseClassOfAmazon  {
	private WebDriver driver;
	private HeaderPageApplication a;
	private Mobile n;
	private Account k;
	String testID;
	
	@BeforeTest
	@Parameters("browser")
	public void launchchromebrowser(String browserName) {
		if(browserName.equals("chrome"))
		{
			driver=chromeBrowser();
		}
		if(browserName.equals("Firefox")) 
		{
			driver=firefoxBrowser();			
		}
		if(browserName.equals("Opera"))
		{
			driver=operaBrowser();			
		}
		
	}
	@BeforeClass
	public void beforeclass() {
//		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
//		 driver=new ChromeDriver();
//		driver.get("https://www.amazon.in");
		a=new HeaderPageApplication(driver);
		n=new Mobile(driver);
		k = new Account(driver);
	}
	@BeforeMethod
	public void startUP() {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		System.out.println("hiiiiiiiiiiiii hellllllllloooo");
	}
	@Test(enabled = false)
	public void testamazon() throws InterruptedException {
		 testID="101";
		 System.out.println(testID);
		a.clickOnBestSellers();
		a.clickOnWallet();
		a.clickOnAddToCart();
	}
	@Test(enabled = false)
	public void mobiledemo() {
		 testID ="102";
		 System.out.println(testID);
		n.mobilemain();
	}
	@Test
	public void accountdemo() throws EncryptedDocumentException, IOException {
		  testID="103";
		 System.out.println(testID);
		 k=new Account(driver);
		 k.mainaccount();
		String user=Utility.getExcelData("POOJA", 0, 0);
		String pass= Utility.getExcelData("POOJA", 0, 1);
		k.emailmethod(user);
		k.continue123();
		k.passmethod(pass);
		k.continue246();
		
		
	}
	@AfterMethod
	public void takescreenshot(ITestResult result) throws IOException {
		
		Utility u = new Utility();
		if(result.SUCCESS==result.getStatus()) {
		u.takeScreenshit(driver, "TestID");
		}
		u.getExcelData("kishor", 1, 1);
	}
	@AfterClass
	public void stop() {
		driver.close();
		}
	}
	

