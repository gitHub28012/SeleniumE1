package testPackage;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericPackage.BaseTest;
import genericPackage.CustomListener;
import genericPackage.Flib;
import pagePackage.HomePage;
import pagePackage.LoginPage;
import pagePackage.TasksPage;

@Listeners(CustomListener.class)
public class CreateNewCustomerAndProject extends BaseTest {

	@Test
	public void createNewCustomerAndProjectTC() throws IOException, EncryptedDocumentException, InterruptedException {
		
		Flib flib = new Flib();
		
		LoginPage lp = new LoginPage(driver);
		String usn = flib.readPropertyData(PROP_PATH, "username");
		String pwd = flib.readPropertyData(PROP_PATH, "password");
		lp.validLoginMethod(usn, pwd);
		
		HomePage hp = new HomePage(driver);
		hp.getTasksModule().click();
		
		TasksPage tp = new TasksPage(driver);
		tp.createCustomerMethod(flib.readExcelData(EXCEL_PATH, "taskspagedetails", 1, 0));
		
		tp.createProjectMethod(flib.readExcelData(EXCEL_PATH, "taskspagedetails", 1, 0), flib.readExcelData(EXCEL_PATH, "taskspagedetails", 1, 1));
		
		Thread.sleep(5000);
		tp.deleteAllcustomersAndProjects();

	}

}
