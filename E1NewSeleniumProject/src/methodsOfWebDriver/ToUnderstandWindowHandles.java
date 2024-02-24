package methodsOfWebDriver;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUnderstandWindowHandles {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://omayo.blogspot.com/");
		
		String parentWindow = driver.getWindowHandle(); // To get the address of parent window
		System.out.println(parentWindow);  // To print the parent window address in the console
		String parentTitle = driver.getTitle(); // To get the title of parent window
		
		driver.findElement(By.partialLinkText("Open a popup window")).click(); // To open a new window
       
		Set<String> allWindows = driver.getWindowHandles(); // To get the address of all the windows
        
        // To iterate and switch the control to the windows one by one
        for(String wh : allWindows)
        {
        	String title = driver.switchTo().window(wh).getTitle(); // To get the title of each window
        	
        	if(!title.equals(parentTitle)) // To compare the titles with parent window title
        	{
        		driver.close(); // To close the Child Window
        		
        	}
        }
	}

}
