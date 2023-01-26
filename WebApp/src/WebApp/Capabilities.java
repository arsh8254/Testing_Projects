package WebApp;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class Capabilities {

	public static AndroidDriver<AndroidElement> capability() throws MalformedURLException {
			// i want to check the capabilities of my androi emulator before i run
			// if i want to test a webapp // i will need a browser // a chrome driver //browser should be update
			DesiredCapabilities dp=new DesiredCapabilities();
			//mobilecapability is common to all
			dp.setCapability(MobileCapabilityType.DEVICE_NAME,"Pixel");
			//this is also default
			//device name and platform name should be there always
			dp.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
			//want to test webapp
			dp.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
			//testing webapp need chromedriver
			dp.setCapability(AndroidMobileCapabilityType.CHROMEDRIVER_EXECUTABLE,"C:\\Selenium\\chromedriver.exe");
			//want to run on this emulator i.e device
			//android driver
			//connecting to appium server
			AndroidDriver<AndroidElement> driver=new AndroidDriver<AndroidElement>(new URL("http://0.0.0.0:4723/wd/hub"),dp);
			return driver;
			
			
		}

}
