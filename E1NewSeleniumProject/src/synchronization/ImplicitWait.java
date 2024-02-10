package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver(); // To Launch Chrome Browser
		driver.manage().window().maximize(); // To maximize the Browser
		
		// To apply implicit wait 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.instagram.com/"); // To Launch the WebApplication
		driver.findElement(By.name("username")).sendKeys("Qspiders"); // To send input to username textfield.
		
		
		
		

	}

}
