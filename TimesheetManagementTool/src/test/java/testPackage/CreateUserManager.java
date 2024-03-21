package testPackage;

import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericPackage.BaseTest;
import genericPackage.CustomListener;
import genericPackage.Flib;
import genericPackage.WorkLib;
import pagePackage.HomePage;
import pagePackage.LoginPage;
import pagePackage.UsersPage;

@Listeners(CustomListener.class)
public class CreateUserManager extends BaseTest {

	@Test
	public void createUserManagerTC() throws IOException, InterruptedException {
		Flib flib = new Flib();
		
		LoginPage lp = new LoginPage(driver);
		
		lp.validLoginMethod(flib.readPropertyData(PROP_PATH, "username"), flib.readPropertyData(PROP_PATH, "password"));

		HomePage hp = new HomePage(driver);
		hp.getUsersModule().click();
		
		UsersPage up = new UsersPage(driver);
		up.getCreateNewUserButton().click();
		
		WorkLib wl = new WorkLib();
		int no = wl.randomNo();
		
		String usn = flib.readExcelData(EXCEL_PATH, "managercreds", 1, 0);
		String pwd = flib.readExcelData(EXCEL_PATH, "managercreds", 1, 1);
		String fname = flib.readExcelData(EXCEL_PATH, "managercreds", 1, 2);
		String lname = flib.readExcelData(EXCEL_PATH, "managercreds", 1, 3);
		
		up.createNewUserMethod(usn+no, pwd+no, fname+no, lname+no);
	}

}
