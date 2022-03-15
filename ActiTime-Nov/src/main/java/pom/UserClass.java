package pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserClass {
	private WebDriver driver;
	
	@FindBy (xpath = "//div[text()='Users']")
	private WebElement users;
	
	@FindBy (xpath = "//td[@class='usersForTTApproverCell manageApproveCell enabled noUsers last']")
	private WebElement noUsers;
	
	@FindBy (xpath = "(//div[@class='greyButton']//span)[6]")
	private WebElement cancel;
	
	@FindBy (xpath = "//span[text()='User']")
	private WebElement users1;
	
	@FindBy (xpath = "//img[@class='closeButton']")
	private WebElement closeButton1;
	
	@FindBy (xpath = "//a[@id='logoutLink']")
	private WebElement logOut;
	
	public UserClass(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	public void usermethod() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		users.click();
		noUsers.click();
		
		//WebElement element=driver.findElement(By.xpath("//div[@class='greyButton']//span)[6]"));
		//((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
	    
		cancel.click();
		
		users1.click();
		
		closeButton1.click();
		
		//Alert s = driver.switchTo().alert();
		//s.accept();
		//Thread.sleep(5000);;
		//logOut.click();
	}

}
