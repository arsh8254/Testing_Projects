package Native;

import java.net.MalformedURLException;

import org.openqa.selenium.WebElement;

import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.touch.LongPressOptions;

// sometimes we need to import directories because java cant do it by itself
//read about static imports in detail and try to remember them for future
import static java.time.Duration.ofSeconds;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;


public class Demo2  extends Capabilities{

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		AndroidDriver<AndroidElement> driver = capability();
		driver.findElement(MobileBy.AccessibilityId("Views")).click();
		Thread.sleep(3000);
		driver.findElement(MobileBy.AccessibilityId("Date Widgets")).click();
		Thread.sleep(3000);
		driver.findElement(MobileBy.AccessibilityId("2. Inline")).click();
		Thread.sleep(3000);
		driver.findElement(MobileBy.AccessibilityId("9")).click();
		Thread.sleep(3000);
		
		WebElement	btn1 = driver.findElementByAccessibilityId("15");
		WebElement	btn2 =	driver.findElementByAccessibilityId("45");
		TouchAction ta = new TouchAction(driver);
		ta.longPress(longPressOptions().withElement(element(btn1)).withDuration(ofSeconds(2))).moveTo(element(btn2)).release().perform();
		

	}

}
