package ReactNativeDummyTestPage;

import java.net.MalformedURLException;
import java.net.URL;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import Config.CommanlyUsedFunctions;
import Config.ConfigClass;
import Config.PropertyFile;
import Config.RecyclerViewActions;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.Setting;

public class MotherClass {
	public ConfigClass cap = new ConfigClass();
	public AppiumDriver<?> Appium;
	public PropertyFile Pre = new PropertyFile();
	public CommanlyUsedFunctions CommanMethods = null;
	public DummyPageElementInitlization DummyPageObj = null;
	public RecyclerViewActions RC = null;

	@BeforeClass
	public void Initializations_Method() throws MalformedURLException {
		System.out.println("Hello.....\nLauching Appium Driver ....");
		Appium = new AppiumDriver<>(new URL(Pre.getProperty("URL")), cap.getCapabilities());
		Appium.setSetting(Setting.WAIT_FOR_IDLE_TIMEOUT, 5);
	}

	@AfterClass
	public void tearDown() {
		System.out.println("Good Byeeeee :)");
		Appium.quit();
	}
}
