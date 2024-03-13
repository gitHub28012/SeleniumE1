package learningTestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class PriorityFlag {

	@Test(priority = -1)
	public void login()
	{
      Reporter.log("This is Login Method", false);
	}

	@Test(priority = 0)
	public void addToCart()
	{
		Reporter.log("This is Add To Cart Method", true);
	}

	@Test (priority = 5)
	public void logout()
	{
		Reporter.log("This is Logout Method", true);
	}
}
