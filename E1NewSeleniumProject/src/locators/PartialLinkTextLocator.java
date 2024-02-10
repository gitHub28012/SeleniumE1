package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialLinkTextLocator {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver(); //To launch Chrome Browser
		driver.manage().window().maximize(); // To Maximize Browser
		driver.get("https://www.facebook.com/"); //To Launch The Web Application
		Thread.sleep(2000);
		
		WebElement partOfLink = driver.findElement(By.partialLinkText("?")); // To Locate Forgotten Password? link
		partOfLink.click(); // To click on Forgotten Password? link
		
	

	}

}
