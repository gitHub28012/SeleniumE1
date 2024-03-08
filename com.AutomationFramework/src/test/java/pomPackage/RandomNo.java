package pomPackage;

import java.util.Random;

public class RandomNo {

	public static void main(String[] args) {
		
		Random r = new Random();
		int no = r.nextInt(1000);
		System.out.println(no);

	}

}
