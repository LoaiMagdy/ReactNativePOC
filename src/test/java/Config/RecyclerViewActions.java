package Config;

import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static java.time.Duration.ofSeconds;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;

public class RecyclerViewActions {
	AppiumDriver<?> Driver;
	WebDriverWait WE;
	int index = 1;
	List<String> TextInsideRecycleViewWithDuplicates = new ArrayList<>();
	List<String> FinalTextInsideRecycleView;
	String AppendedText = "contains(text(), '";
	String EndOfText = "']";
	WebElement TempWebElmt;

	enum Direction {
		UP, DOWN, LEFT, RIGHT;
	}

	int Timeout;

	public RecyclerViewActions(AppiumDriver<?> appium) {
		this.Driver = appium;
		WE = new WebDriverWait(Driver, 5);
	}

	public Boolean ElementIsVisable(String RelativeXpath) {
		try {
			WE.until(ExpectedConditions.visibilityOf(Driver.findElement(By.xpath(RelativeXpath))));
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public Boolean ElementIsVisable(WebElement WELM) {
		try {
			WE.until(ExpectedConditions.visibilityOf(WELM));
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@SuppressWarnings("rawtypes")
	public void swipeScreen(Direction dir, AppiumDriver<?> driver2) {
		final int ANIMATION_TIME = 300; // ms
		final int PRESS_TIME = 1; // ms
		int edgeBorder = 10;
		PointOption pointOptionStart, pointOptionEnd;
		// init screen variables
		Dimension dims = driver2.manage().window().getSize();
		// init start point = center of screen
		pointOptionStart = PointOption.point(dims.width / 2, dims.height / 2);
		switch (dir) {
		case DOWN: // center of footer
			pointOptionEnd = PointOption.point(dims.width / 2, dims.height - edgeBorder);
			break;
		case UP: // center of header
			pointOptionEnd = PointOption.point(dims.width / 2, edgeBorder);
			break;
		case LEFT: // center of left side
			pointOptionEnd = PointOption.point(edgeBorder, dims.height / 2);
			break;
		case RIGHT: // center of right side
			pointOptionEnd = PointOption.point(dims.width - edgeBorder, dims.height / 2);
			break;
		default:
			throw new IllegalArgumentException("swipeScreen(): dir: '" + dir + "' NOT supported");
		}
		try {
			new TouchAction(driver2).press(pointOptionStart).waitAction(waitOptions(ofSeconds(PRESS_TIME)))
					.moveTo(pointOptionEnd).release().perform();
		} catch (Exception e) {
			System.err.println("swipeScreen(): TouchAction FAILED\n" + e.getMessage());
			return;
		}
		try {
			Thread.sleep(ANIMATION_TIME);
		} catch (InterruptedException e) {
		}
	}

	public List<String> GetTextOfAllRecyclerViewItems(String RecyclerViewTextXpath) {
		while (true) {
			if (ElementIsVisable(RecyclerViewTextXpath + "[@content-desc='" + index + "']")) {
				TextInsideRecycleViewWithDuplicates.add(Driver
						.findElement(By.xpath(RecyclerViewTextXpath + "[@content-desc='" + index + "']")).getText());
				index++;
			} else {
				swipeScreen(Direction.UP, Driver);
				if (index==10)
					break;
			}
		}
		FinalTextInsideRecycleView = TextInsideRecycleViewWithDuplicates.stream().distinct()
				.collect(Collectors.toList());

		return FinalTextInsideRecycleView;
	}

	public void ScrollToWebElement(WebElement GenericWebElement) {
		while (true) {
			if (Timeout == 20) {
				Timeout = 0;
				break;
			}
			if (ElementIsVisable(GenericWebElement)) {
				break;
			} else {
				swipeScreen(Direction.UP, Driver);
				Timeout++;
				index = 1;
			}
		}
	}

	public void ScrollUpToWebElement(WebElement GenericWebElement) {
		while (true) {
			if (Timeout == 20) {
				Timeout = 0;
				break;
			}
			if (ElementIsVisable(GenericWebElement)) {
				break;
			} else {
				swipeScreen(Direction.DOWN, Driver);
				index = 1;
			}
		}
	}

	public void ScrollLeftToWebElement(WebElement GenericWebElement) {
		while (true) {
			if (Timeout == 20) {
				Timeout = 0;
				break;
			}
			if (ElementIsVisable(GenericWebElement)) {
				break;
			} else {
				swipeScreen(Direction.RIGHT, Driver);
				index = 1;
			}
		}
	}

	public void ScrollRightToWebElement(WebElement GenericWebElement) {
		while (true) {
			if (Timeout == 20) {
				Timeout = 0;
				break;
			}
			if (ElementIsVisable(GenericWebElement)) {
				break;
			} else {
				swipeScreen(Direction.LEFT, Driver);
				index = 1;
			}
		}
	}

}
