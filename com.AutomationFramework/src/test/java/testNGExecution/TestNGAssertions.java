package testNGExecution;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNGAssertions {
  @Test
  public void validLogin() throws InterruptedException
  {
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("http://127.0.0.1/login.do");
	
	String expectedLoginPageTitle = "actiTIME - Login";

	
	if(driver.getTitle().equals(expectedLoginPageTitle))
	{
		Reporter.log(" Login Title Matched , Test Case Passed !!",true);
		driver.findElement(By.name("username")).sendKeys("admin");
		Thread.sleep(1000);
		driver.findElement(By.name("pwd")).sendKeys("manager");
		Thread.sleep(1000);
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(3000);
		
	}
	
	String ExpectedHomePageTitle="actiTIME - Enter Time-Track";
	
	if(driver.getTitle().equals(ExpectedHomePageTitle))
	{
		Reporter.log(" Home Page Title Matched , Test Case Passed !!",true);
		
		driver.findElement(By.linkText("Logout")).click();
	}
	
  }
}
