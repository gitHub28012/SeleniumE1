package handlingPopups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandlePromptAlertPopup {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://omayo.blogspot.com/");
		
		driver.findElement(By.id("prompt")).click();
		Thread.sleep(1000);
		
		// To switch the control to the popup
		Alert promptAlert = driver.switchTo().alert();
		
		// To get the text of the popup and print in console
		String promptText = promptAlert.getText();
		System.out.println(promptText);
		Thread.sleep(1000);
		
		// To pass inputs to prompt alert popup
		promptAlert.sendKeys("MY NAME IS QSPIDERS");
		Thread.sleep(2000);
		
		// To click on Ok button
		promptAlert.accept();

	}

}
