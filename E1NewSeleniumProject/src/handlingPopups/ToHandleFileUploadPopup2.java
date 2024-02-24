package handlingPopups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleFileUploadPopup2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.w3schools.com/howto/howto_html_file_upload_button.asp");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='myFile']")).sendKeys("C:\\Users\\QSpiders\\Desktop\\ResumeFormat.docx");
		
		

	}

}
