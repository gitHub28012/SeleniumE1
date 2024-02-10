package takesScreenshotPackage;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import com.google.common.io.Files;

public class ByExplicitTypecasting {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.google.co.in/");
		
		
		TakesScreenshot ts= (TakesScreenshot) driver; // To perform typecasting 
		
		File src = ts.getScreenshotAs(OutputType.FILE); // To take the screenshot of the webpage
		
		File dest = new File("./screenshots/google.png"); // To specify the location, name and extension of screenshot
		
		// Files.copy(src, dest); // To save the screenshot into screenshots folder.

		FileHandler.copy(src, dest); //To save the screenshot into screenshots folder.
	}

}
