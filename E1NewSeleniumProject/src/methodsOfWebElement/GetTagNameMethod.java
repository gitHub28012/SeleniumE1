package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTagNameMethod {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("http://127.0.0.1/login.do");
		
		WebElement loginButton = driver.findElement(By.id("loginButton")); // To find Login Button.
		String loginTag = loginButton.getTagName(); //To get the Tag Name of Login Button
		System.out.println(loginTag); //To print the Tag Name of login button in console
		
		WebElement usn = driver.findElement(By.name("username"));// To find username Textbox
		String usnTag = usn.getTagName(); // To get the Tag Name of username Textbox
		System.out.println(usnTag);  // To print the Tag Name of username textbox in console

	}

}
