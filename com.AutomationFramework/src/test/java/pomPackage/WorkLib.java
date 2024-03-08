package pomPackage;

import java.util.Random;

public class WorkLib {

	public int randomNo()
	{
		Random r = new Random();
		int no = r.nextInt(1000);
		return no;	
	}
}
