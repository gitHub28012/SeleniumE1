package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCssValueMethod {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("http://127.0.0.1/login.do");
		
		WebElement loginButton = driver.findElement(By.id("loginButton")); // To find Login Button and store in a variable.
		String cssValue = loginButton.getCssValue("background"); // To get the css value used for background 
		System.out.println(cssValue); // To print the received value in the console
		
		String color = loginButton.getCssValue("color"); // To get the color(values) of login button
        System.out.println(color); // To print the values in the console.
	}

}
