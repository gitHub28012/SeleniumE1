package methodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethod {

	public static void main(String[] args) throws InterruptedException {

    WebDriver driver = new ChromeDriver(); //To launch the browser
    
    driver.navigate().to("https://www.flipkart.com/"); // To launch the web application
    
    Thread.sleep(1000); 
    driver.manage().window().maximize(); //To maximize the browser
    Thread.sleep(1000);
    
    driver.navigate().back(); // To navigate backward
    
    Thread.sleep(1000);
    
    driver.navigate().forward(); // To navigate forward
    
    Thread.sleep(1000);
    
    driver.navigate().refresh(); // To refresh the web page

    
	}

}
