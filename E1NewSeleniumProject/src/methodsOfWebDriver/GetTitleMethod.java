package methodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleMethod {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver(); // Launch the browser
		Thread.sleep(1000);
		driver.manage().window().maximize(); // Maximize the browser
		Thread.sleep(1000);
		driver.get("https://www.facebook.com/"); // Launch the web application
		Thread.sleep(2000);
		
		String title = driver.getTitle(); // To get the Title of the Web Page
		System.out.println(title); 

	}

}
