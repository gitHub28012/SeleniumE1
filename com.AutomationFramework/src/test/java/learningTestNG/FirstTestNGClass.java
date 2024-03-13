package learningTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class FirstTestNGClass {
  @Test
  public void login()
  {
	  Reporter.log("This is Login Method", true);
  }
  
  @Test
  public void addToCart()
  {
	  Reporter.log("This is Add To Cart Method", true);
  }
  
  @Test
  public void logout() 
  {
	  Reporter.log("This is Logout Method", true);
  }
}
