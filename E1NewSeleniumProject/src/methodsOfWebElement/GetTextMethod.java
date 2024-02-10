package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextMethod {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("http://127.0.0.1/login.do");
		
		WebElement loginButton = driver.findElement(By.id("loginButton")); // To find Login Button.

        String loginText = loginButton.getText(); // To get the text of Login Button
        System.out.println(loginText); // To print the text of login button in the console
		
        WebElement link = driver.findElement(By.id("licenseLink")); // To find the link
        String linkText = link.getText(); // To get the text of the link
        System.out.println(linkText); // To print the text of the link
	}

}
