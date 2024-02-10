package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NameLocator {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		WebElement usnTB = driver.findElement(By.name("email"));
		usnTB.sendKeys("admin");
		Thread.sleep(1000);
		
		WebElement passTB = driver.findElement(By.name("pass"));
		passTB.sendKeys("manager");
		Thread.sleep(1000);
		
		WebElement loginBT = driver.findElement(By.name("login"));
		loginBT.click();
		

	}

}
