package testNGListeners;

import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(CustomListener.class)
public class ValidLogin extends BaseTest {
  
	@Test
  public void login() throws InterruptedException 
  {
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys("admi");
		Thread.sleep(1000);
		driver.findElement(By.name("pwd")).sendKeys("manag");
		Thread.sleep(1000);
		driver.findElement(By.id("loginButton")).click();
		
		Thread.sleep(5000);
  }
}
