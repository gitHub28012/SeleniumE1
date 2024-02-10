package takesScreenshotPackage;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class ByBrowserSpecificClass {

	public static void main(String[] args) throws IOException {
		
		ChromeDriver driver = new ChromeDriver(); // To Store the reference with ChromeDriver class
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.facebook.com/");
		
		File src = driver.getScreenshotAs(OutputType.FILE); // To take the screenshot of WebPage
		
		File dest = new File("./screenshots/Facebook.png"); // To Specify the location, name and extension of the screenshot
		
		Files.copy(src, dest); // To copy and paste the screenshot in the specified folder.

	}

}
