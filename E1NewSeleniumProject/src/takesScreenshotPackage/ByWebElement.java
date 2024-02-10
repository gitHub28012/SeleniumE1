package takesScreenshotPackage;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ByWebElement {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriver driver=new ChromeDriver(); // To upcast to WebDriver Interface
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.instagram.com/"); // To launch Instagram
		Thread.sleep(2000);
		
		WebElement loginButton = driver.findElement(By.xpath("//div[text()='Log in']")); // To find login button
		
		File src = loginButton.getScreenshotAs(OutputType.FILE); // To take the screenshot of the webelement
		
		File dest = new File("./screenshots/loginbutton.png"); // To specify the location, name and extension of screenshot
		
		Files.copy(src, dest);	// To copy and paste the screenshot in the specified folder.
	}

}
