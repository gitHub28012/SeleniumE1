package javascriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToScrollTillParticularWebElement {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.selenium.dev/");
		
		WebElement scrollTarget = driver.findElement(By.xpath("//h2[text()='News']"));
		
		// To Typecast into JavascriptExecutor
		JavascriptExecutor js= (JavascriptExecutor)driver;
		
		//To scroll till the particular web element
		js.executeScript("arguments[0].scrollIntoView(false)",scrollTarget);
		

		Thread.sleep(2000);
		//driver.close();
	}

}
