package methodsOfWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitMethod {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver(); // To launch the web application.
		Thread.sleep(1000);
		driver.manage().window().maximize(); // To maximize the browser window.
		Thread.sleep(1000);
		
		driver.get("https://omayo.blogspot.com/"); // To launch the web application
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Open a popup window")).click(); // To open a new(child) Browser window
		Thread.sleep(1000);
		
		//driver.close();

		driver.quit(); // To close the parent as well as child Browser windows.
	}

}
