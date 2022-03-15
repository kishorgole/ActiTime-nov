package pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	private WebDriver driver;
	
	@FindBy (xpath = "//input[@id='username']")
	private WebElement userName;

	@FindBy (xpath = "//input[@name='pwd']")
	private WebElement password;

	@FindBy (xpath = "//a[@id='loginButton']")
	private WebElement login;

	@FindBy (xpath = "//input[@type='checkbox']")  //before or after of login
	private WebElement keepMeLoginCheckbox;
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	public void mainlogin()  {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		userName.sendKeys("admin");
		
		password.sendKeys("manager");
		
		 keepMeLoginCheckbox.click();
		
		 login.click();
		
	}
}
	
