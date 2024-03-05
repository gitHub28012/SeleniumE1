package keyworddrivenframework;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;

public class InvalidLogin extends BaseTest  {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		BaseTest bt = new BaseTest();
		bt.setUp();
		
		Flib flib = new Flib();
		int rc = flib.getRowCount(EXCEL_PATH,"invalidcreds");
		
		for(int i=1; i<=rc; i++)
		{
			String usnData = flib.readExcelData(EXCEL_PATH, "invalidcreds", i, 0);
			String pwdData = flib.readExcelData(EXCEL_PATH, "invalidcreds", i, 1);
			
			driver.findElement(By.name("username")).sendKeys(usnData);
			Thread.sleep(1000);
			driver.findElement(By.name("pwd")).sendKeys(pwdData);
			Thread.sleep(1000);
			driver.findElement(By.id("loginButton")).click();
			Thread.sleep(1000);
			driver.findElement(By.name("username")).clear();
		}
	}

}
