package Config;

import org.openqa.selenium.remote.DesiredCapabilities;

public class ConfigClass {
	DesiredCapabilities capabs = new DesiredCapabilities();
	PropertyFile Pro = new PropertyFile();

	public DesiredCapabilities getCapabilities() {
		try {
			capabs.setCapability("noReset", Pro.getProperty("noReset"));
			capabs.setCapability("platformVersion", Pro.getProperty("platformVersion"));
			capabs.setCapability("platformName", Pro.getProperty("platformName"));
			capabs.setCapability("deviceName", Pro.getProperty("deviceName"));
			capabs.setCapability("udid", Pro.getProperty("udid"));
			//capabs.setCapability("appActivity", Pro.getProperty("appActivity"));
			//capabs.setCapability("appPackage", Pro.getProperty("appPackage"));
			capabs.setCapability("skipDeviceInitialization", Pro.getProperty("skipDeviceInitialization"));
			capabs.setCapability("skipServerInstallation", Pro.getProperty("skipServerInstallation"));
			capabs.setCapability("unicodeKeyboard", Pro.getProperty("unicodeKeyboard"));
			capabs.setCapability("resetKeyboard", Pro.getProperty("resetKeyboard"));
			capabs.setCapability("keyPassword", Pro.getProperty("useKeystore"));
			capabs.setCapability("automationName", Pro.getProperty("automationName"));
			capabs.setCapability("bundleId", Pro.getProperty("bundleId"));
		} catch (Exception e) {

			e.printStackTrace();
		}
		return capabs;
	}
}
