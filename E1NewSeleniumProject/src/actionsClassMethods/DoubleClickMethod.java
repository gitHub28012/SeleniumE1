package actionsClassMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickMethod {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		
		driver.findElement(By.xpath("//section[text()='Button']")).click();
		driver.findElement(By.partialLinkText("Double Click")).click();
		
		WebElement yesButton1 = driver.findElement(By.id("btn20"));
		WebElement noButton2 = driver.findElement(By.id("btn23"));
		WebElement ratingButton3 = driver.findElement(By.id("btn26"));
		
		Actions act = new Actions(driver); // To create the object of Actions Class.
		
		act.doubleClick(yesButton1).perform(); // To perform double click operation on 'yes' button
		
		act.doubleClick(noButton2).perform(); // To perform double click operation on 'no' button
		
		act.doubleClick(ratingButton3).perform(); // To perform double click operation on Rating(3) button

	}

}
