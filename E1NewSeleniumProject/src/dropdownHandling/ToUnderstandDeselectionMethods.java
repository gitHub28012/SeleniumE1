package dropdownHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToUnderstandDeselectionMethods {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("file:///C:/Users/QSP/Desktop/WebElements/MultiSelectDD.html");
		
		WebElement multiSelectDD = driver.findElement(By.id("menu")); // To locate the dropdown and store it in a variable
		
		Select sel = new Select(multiSelectDD); // To create the object of Select class
		
		sel.selectByIndex(3); // To select an option by using index value
		Thread.sleep(3000);  // To stop the execution of code for 3 sec.
		sel.deselectByIndex(3); // To Deselect the selected option by using index value.
		
		sel.selectByValue("v2"); // To select an option by using  value
		Thread.sleep(2000);      // To stop the execution of code for 2 sec.
		sel.deselectByValue("v2"); // To Deselect the selected option by using  value.
		
		sel.selectByVisibleText("Chai"); // To select an option by using Text of the option
		Thread.sleep(2000);              // To stop the execution of code for 2 sec.
		sel.deselectByVisibleText("Chai"); // To Deselect the selected option by Text of the option.

		// To select all the options from the dropdown using for loop
		for(int i =0; i <=6; i++) {
			sel.selectByIndex(i);
			Thread.sleep(1000);
		}
		
		Thread.sleep(2000);
		
		// To deselect all the selected options from the dropdown using for loop.
//		for(int j=0; j<=6;j++) {
//			sel.deselectByIndex(j);
//			Thread.sleep(1000);
//		}
		
		sel.deselectAll();
		
	}

}
