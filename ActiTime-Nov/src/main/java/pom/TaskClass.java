package pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskClass {
	private WebDriver driver;
	@FindBy (xpath = "//a[@class='content tasks']")
	private WebElement tasks;

	
	@FindBy (xpath = "//span[text()='All active projects of all active customers']")  //run 2 time
	private WebElement selectProject;
	
	@FindBy (xpath = "//span[text()='kishor']")
	private WebElement selectKishor;
	
	@FindBy (xpath = "//input[@id='tasksFilterSubmitButton']")
	private WebElement applyFilter;
	
	@FindBy (xpath = "//span[text()='nandkishor']")
	private WebElement selectNandkishor;
	
	@FindBy (xpath = "//label[text()='All active projects of all active customers']")
	private WebElement allActiveProject;
	
	@FindBy (xpath = "//a[@onclick='editTask(3); return false;']")
	private WebElement task1;
	
	//@FindBy (xpath = "(//em[@unselectable='on'])[3]")
	//private WebElement typeOfWork;
	
	//@FindBy (xpath = "(//li[@class='x-menu-list-item '])[2]")
	//private WebElement billable;
	
	@FindBy (xpath = "(//td[@class='x-btn-right'])[5]")
	private WebElement calender;
	
	@FindBy (xpath = "(//td[@class='x-date-active'])[19]")
	private WebElement selectDate;
	
	//@FindBy (xpath = "(//button[@type='button'])[1]")
	//private WebElement status;
	
	@FindBy (xpath = "//div[@id='editTaskPopup_cancelBtn']")
	private WebElement cancel;
	
	//@FindBy (xpath = "//a[@id='ext-gen261']")
	//private WebElement completed;
	
	
	
	@FindBy (xpath = "//img[@id='taskNameCell2_image_2']")
	private WebElement task2;
	
	@FindBy (xpath = "//textarea[@id='editDescriptionPopupText']")
	private WebElement taskDescription;
	
	@FindBy (xpath = "//input[@id='scbutton']")
	private WebElement saveDescription;
	
	@FindBy (xpath = "(//span[@class='deadline'])[2]")
	private WebElement deadline;
	
	@FindBy (xpath = "//input[@id='deadlinePopupText']")  //sendkeys
	private WebElement sendDate;
	
	@FindBy (xpath = "//input[@onclick='saveDeadline()']")  
	private WebElement saveDate;
	
	
	
	@FindBy (xpath = "(//input[@value='1'])[4]")
	private WebElement selectCheckBox;
	
//	@FindBy (xpath = "(//input[@class='hierarchy_element_wide_button'])[2]")
//	private WebElement completSelectTask;
	
	
	public TaskClass(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	public void maintask() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		tasks.click();
		task1.click();
	    calender.click();
		selectDate.click();
	    cancel.click();
	    Alert a=driver.switchTo().alert();
		a.accept();
	    task2.click();
	    taskDescription.clear();
	    taskDescription.sendKeys("Task tab automate successfully");
		saveDescription.click();
	    deadline.click();
		sendDate.clear();
	    sendDate.sendKeys("03/04/2022");
	    saveDate.click();
	    selectCheckBox.click();
	    boolean z= selectCheckBox.isSelected();
	    System.out.println(z);
			  
		   
			//   completSelectTask.click();		
		
	}

}
