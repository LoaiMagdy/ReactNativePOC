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

public class MotherClass {
	ConfigClass cap = new ConfigClass();
	AppiumDriver<?> Appium;
	PropertyFile Pre = new PropertyFile();
	CommanlyUsedFunctions CommanMethods = null;
	DummyPageElementInitlization DummyPageObj = null;
	RecyclerViewActions RC = null;

	@BeforeClass
	public void Initializations_Method() throws MalformedURLException {
		System.out.println("Hello.....\nLauching Appium Driver ....");
		Appium = new AppiumDriver<>(new URL(Pre.getProperty("URL")), cap.getCapabilities());
	}

	@AfterClass
	public void tearDown() {
		System.out.println("Good Byeeeee :)");
		Appium.quit();
	}
}
