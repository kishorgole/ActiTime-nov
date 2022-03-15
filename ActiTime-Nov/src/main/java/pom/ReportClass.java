package pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReportClass {
	
	private WebDriver driver;
	
	@FindBy (xpath = "//div[text()='Reports']")
	private WebElement reports;
	
	@FindBy (xpath = "//span[text()='Create Report']")
	private WebElement createReport;

	@FindBy (xpath = "//input[@id='configureReportParametersButton']")
	private WebElement configurReport;

	@FindBy (xpath = "(//div[@class='i'])[7]")
	private WebElement dateRange;

	@FindBy (xpath = "(//div[text()='Current & 2 previous weeks'])[3]")
	private WebElement rangeFormat;

	@FindBy (xpath = "//span[@id='ext-gen180']")
	private WebElement chooseCustomer;

	@FindBy (xpath = "//span[text()='kishor']")
	private WebElement selectCustomer;

	@FindBy (xpath = "//span[text()='Close']")
	private WebElement closeTab;

	@FindBy (xpath = "//input[@id='cancelChanges']")
	private WebElement cancelReport;

	public ReportClass (WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	public void mainreport() {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		reports.click();
		createReport.click();
		 configurReport.click();
		 dateRange.click();
		Actions s=new Actions(driver);
		s.moveToElement(dateRange).click().build().perform();
		chooseCustomer.click();
		selectCustomer.click();
		closeTab.click();
		cancelReport.click();
		 
	}

}
