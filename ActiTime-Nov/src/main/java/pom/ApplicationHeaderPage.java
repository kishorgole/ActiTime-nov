package pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ApplicationHeaderPage {
	private WebDriver driver;

	@FindBy (xpath = "//a[@class='content tasks']")
	private WebElement tasks;

	@FindBy (xpath = "//div[text()='Reports']")
	private WebElement reports;
	
	@FindBy (xpath = "//a[@class='content users']")    
	private WebElement users;

	@FindBy (xpath = "//div[text()='Work Schedule']")    
	private WebElement workSchedule;
	
	public ApplicationHeaderPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	public void mainapplication() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
		tasks.click();
		
		reports.click();
		
		users.click();
		
		workSchedule.click();
		
	}
}

