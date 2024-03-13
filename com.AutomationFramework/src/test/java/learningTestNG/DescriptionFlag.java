package learningTestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DescriptionFlag {
  @Test(description = "This method is for login", priority = 1)
  public void login() 
  {
	  Reporter.log("Login Method ", true);
  }
  
  @Test (description = "This method is for add to cart", priority = 2)
  public void addToCart() 
  {
	  Reporter.log("Add to cart Method ", true);
  }
  
  @Test (description = "This method is for logout", priority = 3)
  public void logout() 
  {
	  Reporter.log("Logout Method ", true);
  }
  
}
