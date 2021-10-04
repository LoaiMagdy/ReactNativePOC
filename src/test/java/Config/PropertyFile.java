package Config;

import java.io.FileInputStream;
import java.io.InputStream;

public class PropertyFile {
	public String getProperty(String property) {
		String propertyValue = "";
		InputStream in = null;
		try {
			java.util.Properties props = new java.util.Properties();
			in = new FileInputStream("src/test/resources/Properties.txt");
			props.load(in);
			propertyValue = props.getProperty(property).trim();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return propertyValue;
	}
	
	public String getWebElementString(String property) {
		String propertyValue = "";
		InputStream in = null;
		try {
			java.util.Properties props = new java.util.Properties();
			in = new FileInputStream("src/test/resources/WebElements.txt");
			props.load(in);
			propertyValue = props.getProperty(property).trim();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return propertyValue;
	}
}
