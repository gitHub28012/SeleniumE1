package genericPackage;

import java.util.Random;

import org.openqa.selenium.support.ui.Select;

public class WorkLib {

	public int randomNo()
	{
		Random r = new Random();
		int no = r.nextInt(1000);
		return no;	
	}
	
	
}
