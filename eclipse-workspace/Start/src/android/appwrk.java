package android;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class appwrk {
	WebDriver Driver;
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub

		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"Pixel10");
		//capabilities.setCapability(MobileCapabilityType.BROWSER_NAME,"Chrome");
		capabilities.setCapability("appPackage", "com.android.chrome");
		capabilities.setCapability("appActivity", "com.google.android.apps.chrome.Main");
		capabilities.setCapability("noReset", "true");


		//   URL url = new URL(get.getProperty("URL"));
		AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub/"),capabilities);
		driver.get("https://dev.appwrk.com/");
		Thread.sleep(50000);
		 driver.findElement(By.className("android.view.View")).click();
	}

}
