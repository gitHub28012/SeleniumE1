package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver(); // To Launch Chrome Browser
		driver.manage().window().maximize(); // To maximize The Browser
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));// To declare Implicit wait
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10)); // To declare Explicit wait
		
		driver.get("https://shoppersstack.com/"); // To Launch the Web Application
		
		driver.findElement(By.xpath("//span[text()='APPLE iPhone 14 Pro']")).click();
		
		driver.findElement(By.id("Check Delivery")).sendKeys("411033");
		
		// 1st way to use Explicit wait or provide waiting condition
//		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//button[@id='Check']"))));
//		driver.findElement(By.xpath("//button[@id='Check']")).click();
		
		
		// 2nd way to use Explicit wait or provide waiting condition
		WebElement checkButton = driver.findElement(By.xpath("//button[@id='Check']"));
		wait.until(ExpectedConditions.elementToBeClickable(checkButton));
		checkButton.click();
		
		

	}

}
