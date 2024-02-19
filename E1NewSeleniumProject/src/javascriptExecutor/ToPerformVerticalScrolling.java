package javascriptExecutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToPerformVerticalScrolling {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.selenium.dev/");
		
		// To Typecast into JavascriptExecutor
		JavascriptExecutor js= (JavascriptExecutor)driver;
		
		//To perform downward Scrolling operation
		js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(2000);
	
		
		//To perform upward Scrolling operation
		js.executeScript("window.scrollBy(0,-500)");
        Thread.sleep(2000);
        
        driver.close();
	}

}
