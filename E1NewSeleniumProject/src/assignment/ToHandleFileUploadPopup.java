package assignment;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToHandleFileUploadPopup {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.w3schools.com/howto/howto_html_file_upload_button.asp");
		Thread.sleep(2000);
		
		WebElement fileUploadButton = driver.findElement(By.id("myFile"));
		
		Actions act = new Actions(driver);
		act.click(fileUploadButton).perform(); // To Click on Choose File Button
		
		// To handle File Upload Popup by passing the relative path of file
		Runtime.getRuntime().exec("./autoItPrograms/w3cschools.exe");
	
	}

}
