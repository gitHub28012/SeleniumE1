package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorLocator {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver(); // To launch Chrome Browser
		driver.manage().window().maximize(); // To maximize the browser window
		driver.get("https://www.instagram.com/"); // To launch the web application
		Thread.sleep(2000);
		
		// To find/locate username textbox and pass the inputs
		WebElement usnTB = driver.findElement(By.cssSelector("input[aria-label^='Ph']"));
		usnTB.sendKeys("qspiders");
		Thread.sleep(1000);
		
		// To find/locate password textBox and pass the inputs
		WebElement passTB = driver.findElement(By.cssSelector("input[type$='word']"));
		passTB.sendKeys("Password@123");
		Thread.sleep(1000);
		
		// To click on login button.
		WebElement loginButton = driver.findElement(By.cssSelector("button[type*='bm']"));
		loginButton.click();

	}

}
