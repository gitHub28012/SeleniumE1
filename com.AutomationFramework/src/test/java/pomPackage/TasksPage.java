package pomPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class TasksPage {

	@FindBy(xpath = "//a[text()='Projects & Customers']") private WebElement projectsAndCustomersLink;
	@FindBy(xpath = "//input[@value='Create New Customer']") private WebElement createNewCustomerButton;
	@FindBy(name = "name") private WebElement customerNameTB;
	@FindBy(name = "createCustomerSubmit") private WebElement createCustomerButton;
	@FindBy(xpath = "//input[contains(@value,' Cancel')]") private WebElement createCustomerCancelButton;
	@FindBy(xpath = "//input[@value='Create New Project']") private WebElement createNewProjectButton;
	@FindBy(name = "customerId") private WebElement selectCustomerDropdown;
	@FindBy(name = "name") private WebElement projectNameTB;
	@FindBy(name = "createProjectSubmit") private WebElement createProjectButton;
	@FindBy(xpath = "//input[contains(@value,' Cancel')]") private WebElement createProjectCancelButton;
	@FindBy(linkText = "All") private WebElement allCustomersAndProjectsLink;
	@FindBy(xpath = "//input[@value='Delete Selected']") private WebElement deleteSelectedButton;
	@FindBy(xpath = "//input[@value='Archive Selected']") private WebElement archiveSelectedButton;
	@FindBy(id = "deleteButton") private WebElement deleteThisCustomerPopup;
	
	public TasksPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	public WebElement getProjectsAndCustomersLink() {
		return projectsAndCustomersLink;
	}

	public WebElement getCreateNewCustomerButton() {
		return createNewCustomerButton;
	}

	public WebElement getCustomerNameTB() {
		return customerNameTB;
	}

	public WebElement getCreateCustomerButton() {
		return createCustomerButton;
	}

	public WebElement getCreateCustomerCancelButton() {
		return createCustomerCancelButton;
	}

	public WebElement getCreateNewProjectButton() {
		return createNewProjectButton;
	}

	public WebElement getSelectCustomerDropdown() {
		return selectCustomerDropdown;
	}

	public WebElement getProjectNameTB() {
		return projectNameTB;
	}

	public WebElement getCreateProjectButton() {
		return createProjectButton;
	}

	public WebElement getCreateProjectCancelButton() {
		return createProjectCancelButton;
	}

	public WebElement getAllCustomersAndProjectsLink() {
		return allCustomersAndProjectsLink;
	}

	public WebElement getDeleteSelectedButton() {
		return deleteSelectedButton;
	}

	public WebElement getArchiveSelectedButton() {
		return archiveSelectedButton;
	}
	
	
	public WebElement getDeleteThisCustomerPopup() {
		return deleteThisCustomerPopup;
	}

	public void createCustomerMethod(String customerName) throws InterruptedException
	{
		Thread.sleep(1000);
		projectsAndCustomersLink.click();
		createNewCustomerButton.click();
		customerNameTB.sendKeys(customerName);
		createCustomerButton.click();
	}
	
	public void createProjectMethod(String customerName, String projectName) throws InterruptedException
	{
		Thread.sleep(1000);
		projectsAndCustomersLink.click();
		createNewProjectButton.click();
		
		Select sel = new Select(selectCustomerDropdown);
		sel.selectByVisibleText(customerName);
		
		projectNameTB.sendKeys(projectName);
		createProjectButton.click();
		
	}
	
	public void deleteAllcustomersAndProjects() throws InterruptedException
	{
		Thread.sleep(1000);
		projectsAndCustomersLink.click();
		allCustomersAndProjectsLink.click();
		deleteSelectedButton.click();
		deleteThisCustomerPopup.click();
		
	}
}
