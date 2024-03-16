package testNGExecution;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ToUnderstandDataProvider {
 
	@Test(dataProvider = "actitimeData")
  public void loginMethod(String usn, String pwd) throws InterruptedException {
		  WebDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		  driver.get("http://127.0.0.1/login.do");
		  Thread.sleep(2000);
		  
		  driver.findElement(By.name("username")).sendKeys(usn);
		  Thread.sleep(1000);
		  driver.findElement(By.name("pwd")).sendKeys(pwd);
		  Thread.sleep(1000);
		  driver.findElement(By.id("loginButton")).click();
  }
	
	@DataProvider (name="actitimeData")
	public Object [][] testData()
	{
		Object [][] data = new Object [5][2];
		
		data[0][0]="a d m i n";
		data[0][1]="m a n a g e r";
		
		data[1][0]="admin@123";
		data[1][1]="manager@123";
		
		data[2][0]="manager";
		data[2][1]="admin";
		
		data[3][0]="admin_123";
		data[3][1]="admin@123";
		
		data[4][0]="manager";
		data[4][1]="manager";
		
		return data;
		
	}
}
