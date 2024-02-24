package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoAppsFramesAssignment {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		
		driver.findElement(By.xpath("//section[text()='Frames']")).click();// To click on Frames Option
		
		driver.findElement(By.xpath("//section[text()='iframes']")).click(); // To click on iframe Option
		
		// To find the Frame and store in a variable
		WebElement frameElement = driver.findElement(By.xpath("//iframe[@class='w-full h-96']"));
		
		// To switch the control to Frame Element
		driver.switchTo().frame(frameElement); 
		
		// To find the element present inside the frame
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Qspiders");
		
		// To switch the control back to main webpage
		driver.switchTo().defaultContent();
		
		// To click on Nested iframe Option on main webpage
		driver.findElement(By.partialLinkText("Nested iframe")).click();

	}

}
