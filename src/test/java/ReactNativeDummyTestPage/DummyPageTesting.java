package ReactNativeDummyTestPage;

import java.util.List;

import org.testng.annotations.Test;

import Config.CommanlyUsedFunctions;
import Config.RecyclerViewActions;

public class DummyPageTesting extends MotherClass {

	// Variables
	String PageTitle = "Hello World!";
	String BodyText = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";
	String BottomSheetTopUpTitle = "Bottom Sheet!";
	String NativeShareScreenTitle = "React Native | A framework for building native apps using React";
	List<String> RecycleViewTXT;

	// RecyclerViewActions RC = new RecyclerViewActions(Appium);
	@Test(priority = 0)
	public void InitializingObjects() {
		DummyPageObj = new DummyPageElementInitlization(Appium);
		CommanMethods = new CommanlyUsedFunctions(Appium);
		RC = new RecyclerViewActions(Appium);
	}

	@Test(priority = 1)
	public void TilteApperanceAndText() {
		System.out.println("Start Step#1....");
		CommanMethods.WaitingWebElemnt(DummyPageObj.Title, 30);
		CommanMethods.ValidatingEqualityOfText(PageTitle, DummyPageObj.Title);
		System.out.println("Step#1 Finished....");
	}

	@Test(priority = 2)
	public void BodyApperanceAndText() {
		System.out.println("Start Step#2....");
		CommanMethods.WaitingWebElemnt(DummyPageObj.Body, 30);
		CommanMethods.ValidatingEqualityOfText(BodyText, DummyPageObj.Body);
		System.out.println("Step#2 Finished....");
	}

	@Test(priority = 3)
	public void BottomBottonAndClickingOn() {
		System.out.println("Start Step#3....");
		CommanMethods.WaitingWebElemnt(DummyPageObj.BottomSheetBtn, 30);
		CommanMethods.ClickingOnWebElement(DummyPageObj.BottomSheetBtn);
		System.out.println("Step#3 Finished....");
	}

	@Test(priority = 4)
	public void BottomSheetTopUp() {
		System.out.println("Start Step#4....");
		CommanMethods.WaitingWebElemnt(DummyPageObj.BottomSheetTopUpTitle, 30);
		CommanMethods.ValidatingEqualityOfText(BottomSheetTopUpTitle, DummyPageObj.BottomSheetTopUpTitle);
		CommanMethods.ImageApperance(DummyPageObj.BottomSheetTopUpImage, 30);
		CommanMethods.WaitingWebElemnt(DummyPageObj.BottomSheetTopUpDismissBtn, 30);
		CommanMethods.ClickingOnWebElement(DummyPageObj.BottomSheetTopUpDismissBtn);
		System.out.println("Step#4 Finished....");
	}

	@Test(priority = 5)
	public void NativeButtonAndClickingOn() {
		System.out.println("Start Step#5....");
		CommanMethods.WaitingWebElemnt(DummyPageObj.NativeShareBtn, 30);
		CommanMethods.ClickingOnWebElement(DummyPageObj.NativeShareBtn);
		CommanMethods.WaitingWebElemnt(DummyPageObj.NativeShareScreenCommunicationDailog, 30);
		CommanMethods.ValidatingEqualityOfText(NativeShareScreenTitle, DummyPageObj.NativeShareScreenTitle);
		Appium.navigate().back();
		System.out.println("Step#5 Finished....");
	}

	@Test(priority = 6)
	public void CheckRecycleView() throws InterruptedException {
		System.out.println("Start Step#6....");
		Thread.sleep(10000);
		RecycleViewTXT = RC.GetTextOfAllRecyclerViewItems(DummyPageObj.ListXpath);
		System.out.println("RecycleViewTXT.size():  " + RecycleViewTXT.size());
		for (int i = 0; i < RecycleViewTXT.size(); i++) {
			System.out.println("Recycle View Item# " + i + ": " + RecycleViewTXT.get(i));
		}
		System.out.println("Step#6 Finished....");
	}

}
