package methodsOfWebDriver;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToMethod {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver(); // Launch the browser
		Thread.sleep(2000);
		driver.manage().window().maximize(); // Maximize the browser
		Thread.sleep(1000);
		driver.get("https://www.google.co.in/"); // Launch the web application
		Thread.sleep(2000);
		
		WebElement activeEle = driver.switchTo().activeElement(); // To Switch the control to activeElement
		activeEle.sendKeys("Java",Keys.ENTER); // Pass the inputs to activeElement and press enter button.

	}

}
