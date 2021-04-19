package commons;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Utilities {
	
	public static String getConfigProperty(String propertyName) {
		// this method reads the property values and returns it as a string
		Properties prop  = new Properties();
		try {
			File configProperties = new File("src/test/resources/config.properties");
			prop.load(new FileInputStream(configProperties));
		}
		catch(FileNotFoundException e) {}
		catch (IOException e) {}
		
		return prop.getProperty(propertyName);
	}
}
