package handlingFrames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToSwitchUsingParentFrameMethod {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.bluestone.com/");
		
		driver.findElement(By.id("denyBtn")).click();
		
		WebElement chatFrame = driver.findElement(By.xpath("//iframe[@id='fc_widget']"));
		
		driver.switchTo().frame(chatFrame);
		driver.findElement(By.xpath("//div[@id='chat-icon']")).click();
		
		driver.switchTo().parentFrame();
		driver.findElement(By.id("chat-fc-name")).sendKeys("Qspiders");
		
		
		
        
		

	}

}
