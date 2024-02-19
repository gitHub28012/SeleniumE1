package handlingPopups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleAlertPopup {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://omayo.blogspot.com/");
		
		// To generate alert Popup
		driver.findElement(By.id("alert1")).click();
		Thread.sleep(3000);
		
		// To switch the control to Alert Popup
		Alert alertPopup = driver.switchTo().alert();
		
		// To click on Ok button 
		//alertPopup.accept();
		
		alertPopup.dismiss();
       

	}

}
