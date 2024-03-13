package learningTestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class EnabledFlag {
	
	@Test (enabled = true)
	  public void login() 
	  {
		  Reporter.log("Login Method ", true);
	  }
	  
	  @Test (enabled = false)
	  public void addToCart() 
	  {
		  Reporter.log("Add to cart Method ", true);
	  }
	  
	  @Test (enabled = true)
	  public void logout() 
	  {
		  Reporter.log("Logout Method ", true);
	  }
	  
}
