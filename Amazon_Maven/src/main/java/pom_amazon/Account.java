package pom_amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Account {
	private WebDriver driver;
	
	@FindBy (xpath = "//span[@class='nav-line-2 ']")
	private WebElement signin; 
	
	@FindBy (xpath = "//span[text()='Your Orders']")
	private WebElement myorder;

	
	@FindBy (xpath = "//input[@id='ap_email']")
	private WebElement email;

	
	@FindBy (xpath = "//input[@id='continue']")
	private WebElement continue1;

	@FindBy (xpath = "//input[@id='ap_password']")
	private WebElement password;

	@FindBy (xpath = "//input[@id='signInSubmit']")
	private WebElement continue2;

	public Account(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	public void mainaccount() {
		Actions a =new Actions(driver);
		a.moveToElement(signin).perform();
		a.moveToElement(myorder).click().build().perform();
	//	email.sendKeys());
	//	continue1.click();
	//	password.sendKeys();
	//	continue2.click();
	}
	public void emailmethod(String user) {
		email.sendKeys(user);
	}
	public void passmethod(String pass) {
		password.sendKeys(pass);
	}
	public void continue123() {
		continue1.click();
	}
	public void continue246() {
		continue2.click();
	}


}
