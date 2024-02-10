package assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TrelloDragAndDropAssignment {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		driver.get("https://trello.com/home");

		Actions act = new Actions(driver); // To create Actions Class Object

		// Steps to Login to Trello
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("username")).sendKeys("collingoves1996@gmail.com");
		driver.findElement(By.xpath("//span[text()='Continue']")).click();
		driver.findElement(By.id("password")).sendKeys("Favoured#7");
		driver.findElement(By.xpath("//span[text()='Log in']")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[text()='E1'])[1]")));
		driver.findElement(By.xpath("(//div[text()='E1'])[1]")).click();

		// Source Elements
		WebElement javaSrc = driver.findElement(By.xpath("//a[text()='JAVA']"));
		WebElement manualSrc = driver.findElement(By.xpath("//a[text()='Manual Testing']"));
		WebElement apiSrc = driver.findElement(By.xpath("//a[text()='API']"));
		WebElement seleniumSrc = driver.findElement(By.xpath("(//a[text()='Selenium'])[1]"));
		WebElement sqlSrc = driver.findElement(By.xpath("//a[text()='SQL']"));

		// Target Elements
		WebElement mockGivenTarget = driver.findElement(By.xpath("//h2[text()='Mock Given']"));
		WebElement mockPendingTarget = driver.findElement(By.xpath("//textarea[text()='Mock Pending']"));
		WebElement mockScheduledTarget = driver.findElement(By.xpath("//textarea[text()='Mock Scheduled']"));

		// To perform Drag and Drop Operations
		Actions dragAndDrop = act.dragAndDrop(javaSrc, mockGivenTarget);
		dragAndDrop.perform();

		act.dragAndDrop(manualSrc, mockGivenTarget).perform();

		act.dragAndDrop(apiSrc, mockPendingTarget).perform();

		act.dragAndDrop(seleniumSrc, mockScheduledTarget).perform();

		act.dragAndDrop(sqlSrc, mockGivenTarget).perform();

		// To perform ContextClick Operation
		WebElement contextElement = driver.findElement(By.xpath("//a[text()='JAVA']"));
		act.contextClick(contextElement).perform();

		// To capture all the options 
		List<WebElement> options = driver.findElements(By.xpath("//button[contains(@class,'BppQGb2j7TfyB5')]"));

		// To print all the Options using for loop
		for (int i = 0; i < options.size(); i++) {
			System.out.println(options.get(i).getText());
		}

		Thread.sleep(1000);
		driver.close();

	}

}
