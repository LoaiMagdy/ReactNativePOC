package ReactNativeDummyTestPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;

public class DummyPageElementInitlization {
	// Elements Initializations
	//@FindBy(how = How.XPATH, using = "//android.widget.TextView[@content-desc='TitleID']")
	@FindBy(how = How.ID, using = "TitleID")
	WebElement Title;

	//@FindBy(how = How.XPATH, using = "//android.widget.TextView[@content-desc='DescriptionID']")
	@FindBy(how = How.ID, using = "DescriptionID")
	WebElement Body;

	//@FindBy(how = How.XPATH, using = "//android.widget.Button[@content-desc='BottomSheetID']")
	@FindBy(how = How.ID, using = "BottomSheetID")
	WebElement BottomSheetBtn;

	//@FindBy(how = How.XPATH, using = "//android.widget.Button[@content-desc='NativeShareID']")
	@FindBy(how = How.ID, using = "NativeShareID")
	WebElement NativeShareBtn;
	
	//@FindBy(how = How.XPATH, using = "//android.widget.TextView[@content-desc='BottomSheetTextID']")
	@FindBy(how = How.ID, using = "BottomSheetTextID")
	WebElement BottomSheetTopUpTitle;
	
	//@FindBy(how = How.XPATH, using = "//android.widget.Button[@content-desc='BottomSheetDismissID']")
	@FindBy(how = How.ID, using = "BottomSheetDismissID")
	WebElement BottomSheetTopUpDismissBtn;
	
	//@FindBy(how = How.XPATH, using = "//android.widget.ImageView[@content-desc='BottomSheetImageID']")
	@FindBy(how = How.ID, using = "BottomSheetImageID")
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
