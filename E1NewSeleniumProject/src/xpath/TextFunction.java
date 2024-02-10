package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextFunction {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("http://127.0.0.1/login.jsp");
	    Thread.sleep(2000);
	    
//	    WebElement loginButton = driver.findElement(By.xpath("//a[text()='Login']"));
//	    loginButton.click();
	    
	    // To click on login button by using text of the web element
	    WebElement login = driver.findElement(By.xpath("//a[.='Login']"));
	    login.click();

	}

}
