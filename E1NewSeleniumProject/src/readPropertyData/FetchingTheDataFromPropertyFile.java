package readPropertyData;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FetchingTheDataFromPropertyFile {

	public static void main(String[] args) throws IOException {

		// create the object of FileInputStream class
		FileInputStream fis = new FileInputStream("./data/CommanData.properties");

		// create the object of properties class
		Properties prop = new Properties();

		// load all the keys
		prop.load(fis);

		// use get property method
		String value = prop.getProperty("Browser");

		System.out.println(value);

		System.out.println(prop.getProperty("url"));

	}

}
