package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagNameLocator {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver(); // Launch The Browser
		driver.manage().window().maximize(); // To maximize the browser window
		driver.get("file:///C:/Users/QSP/Desktop/WebElements/Textbox.html"); // To launch Web Application
		Thread.sleep(2000);
		
		
		WebElement textBox = driver.findElement(By.tagName("input")); // Find Password TextField on the webpage.
		textBox.sendKeys("manager"); // To pass the inputs to Password TextField.
		
		// Note :- Inputs are passed to Username TextField because it is the 1st element designed with input tag.

	}

}
