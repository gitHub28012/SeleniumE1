package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocationMethod {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("http://127.0.0.1/login.do");
		
		WebElement loginButton = driver.findElement(By.id("loginButton")); // To find Login Button.
		
		Point point = loginButton.getLocation(); // To get the location of login button.
		int x_axis = point.getX();  // To get the x-axis point of login button. 
	    int y_axis = point.getY();  // To get the y-axis point of login button.
	    
	    System.out.println("X axis is : "+x_axis+"  "+"Y axis is : "+y_axis); // To print the values of X & y axis in the console.

	}

}
