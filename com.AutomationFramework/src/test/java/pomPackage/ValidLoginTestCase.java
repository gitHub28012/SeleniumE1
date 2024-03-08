package pomPackage;

import java.io.IOException;

import org.openqa.selenium.By;

public class ValidLoginTestCase extends BaseTest {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		// To load the non Static members from BaseTest class
		BaseTest bt = new BaseTest();
		bt.setUp();
		
		// To load the non static members from Flib class
		Flib flib = new Flib();
		
		// To load the non static members from LoginPage class
		LoginPage lp = new LoginPage(driver);
		
		// To perform login operation by calling the method
		lp.validLoginMethod(flib.readPropertyData(PROP_PATH, "username"),flib.readPropertyData(PROP_PATH, "password"));
	
	    Thread.sleep(5000);
	    
	    HomePage hp = new HomePage(driver);
	    hp.getLogoutLink().click();
	    
	}

}
