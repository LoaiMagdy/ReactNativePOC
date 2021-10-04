package ReactNativeDummyTestPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;

public class DummyPageElementInitlization {
	// Elements Initializations
	@FindBy(how = How.XPATH, using = "//android.widget.TextView[@content-desc='TitleID']")
	WebElement Title;

	@FindBy(how = How.XPATH, using = "//android.widget.TextView[@content-desc='DescriptionID']")
	WebElement Body;

	@FindBy(how = How.XPATH, using = "//android.widget.Button[@content-desc='BottomSheetID']")
	WebElement BottomSheetBtn;

	@FindBy(how = How.XPATH, using = "//android.widget.Button[@content-desc='NativeShareID']")
	WebElement NativeShareBtn;
	
	@FindBy(how = How.XPATH, using = "//android.widget.TextView[@content-desc='BottomSheetTextID']")
	WebElement BottomSheetTopUpTitle;
	
	@FindBy(how = How.XPATH, using = "//android.widget.Button[@content-desc='BottomSheetDismissID']")
	WebElement BottomSheetTopUpDismissBtn;
	
	@FindBy(how = How.XPATH, using = "//android.widget.ImageView[@content-desc='BottomSheetImageID']")
	WebElement BottomSheetTopUpImage;
	
	@FindBy(how = How.XPATH, using = "(//android.widget.TextView)[1]")
	WebElement NativeShareScreenTitle;

	@FindBy(how = How.XPATH, using = "//*[@resource-id='android:id/chooser_row_text_option']")
	WebElement NativeShareScreenCommunicationDailog;

	String ListXpath = "//android.widget.TextView";

	public DummyPageElementInitlization(AppiumDriver<?> App) {
		PageFactory.initElements(App, this);
	}

}
