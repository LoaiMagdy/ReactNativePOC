package Config;

import static org.testng.Assert.assertEquals;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;

public class CommanlyUsedFunctions {

	WebDriverWait WaitingObj;
	AppiumDriver<?> AppDriver;

	public CommanlyUsedFunctions(AppiumDriver<?> App) {
		this.AppDriver = App;
	}

	public void ValidatingEqualityOfText(String GenricText, WebElement WEBElmt) {
		try {
			assertEquals(WEBElmt.getText(), GenricText);
		} catch (Exception e) {
			System.err.println(
					"Assertion Error:\n  Expected Value: " + GenricText + "\n  Actual Value: " + WEBElmt.getText());
		}
	}

	public void ClickingOnWebElement(WebElement WEBElmt) {
		try {
			WEBElmt.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void WaitingWebElemnt(WebElement WEBElmt, int TimeoutIntegar) {
		WaitingObj = new WebDriverWait(AppDriver, TimeoutIntegar);
		WaitingObj.until(ExpectedConditions.visibilityOf(WEBElmt));
	}

	public void ImageApperance(WebElement WEBElmt, int TimeoutIntegar) {
		WaitingObj = new WebDriverWait(AppDriver, TimeoutIntegar);
		WaitingObj.until(ExpectedConditions.visibilityOf(WEBElmt));
		System.out.println("Image Appeared");
	}
}
