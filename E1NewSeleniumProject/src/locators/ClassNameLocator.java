package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassNameLocator {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver(); // Launch The Browser
		driver.manage().window().maximize(); // To maximize the browser window
		driver.get("file:///C:/Users/QSP/Desktop/WebElements/Textbox.html"); // To launch Web Application
		Thread.sleep(2000);
		
		WebElement passTextBox = driver.findElement(By.className("textbox"));// To find the webelement based on class value.
		passTextBox.sendKeys("manager"); //To pass input to password textbox.

	}

}
