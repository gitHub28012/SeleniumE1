package javascriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleDisabledElement {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demoapps.qspiders.com/ui");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//li[text()='Disabled']")).click();
		Thread.sleep(1000);

		WebElement disabledTextbox = driver.findElement(By.id("name"));
		
		// To Typecast into JavascriptExecutor
		JavascriptExecutor js = (JavascriptExecutor) driver;

		// To pass input to Disabled Element
		js.executeScript("document.getElementById('name').value='admin'");
		Thread.sleep(3000);
		
		// To clear the content from a disabled Textbox
	//	js.executeScript("document.getElementById('name').value=''");
		
		js.executeScript("arguments[0].value=''",disabledTextbox);

	}
}
