package assignment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class GoogleMapsFrameAssignment {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.navigate().to("https://www.google.co.in/");
		
		// To click on google apps Option
		driver.findElement(By.xpath("//a[@aria-label='Google apps']")).click();
		
		// To Switch the control to Frame
		driver.switchTo().frame("app");
		
		// To click on Maps App
		driver.findElement(By.xpath("//span[text()='Maps']")).click();
		Thread.sleep(3000);
		
		// To take the screenshot of maps
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshots/maps.png");
		Files.copy(src, dest);
		
		// To navigate backwards
		driver.navigate().back();
		
	}

}
