package methodsOfWebDriver;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetPositionMethod {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver(); // To Launch the browser
		Thread.sleep(1000);
		driver.manage().window().maximize(); // To maximize the browser window
		Thread.sleep(1000);
		
		Point targetPoint = new Point(400,200); // To pass x and y co-ordinates
		
		driver.manage().window().setPosition(targetPoint); // To pass the co-ordinated to setPosition Method.

	}

}
