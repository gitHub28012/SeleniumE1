package takesScreenshotPackage;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.google.common.io.Files;

public class ByEventFiringWebDriver {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver=new ChromeDriver(); // To upcast to WebDriver Interface
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.instagram.com/");
		
		EventFiringWebDriver efwd = new EventFiringWebDriver(driver); // To create the object of EventFiringWebDriver class and pass driver reference
		
		File src = efwd.getScreenshotAs(OutputType.FILE); // To take the screenshot of the webpage
		
		File dest = new File("./screenshots/instagram.png"); // To specify the location, name and extension of screenshot
		
		Files.copy(src, dest); // To copy and paste the screenshot in the specified folder.

		
	}

}
