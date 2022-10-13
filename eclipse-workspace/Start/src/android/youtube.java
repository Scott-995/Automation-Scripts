package android;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class youtube {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {



		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"Pixel10");
		//capabilities.setCapability(MobileCapabilityType.VERSION,"9.0");
		capabilities.setCapability("appPackage", "com.google.android.youtube");
		capabilities.setCapability("appActivity","com.google.android.apps.youtube.app.application.Shell$HomeActivity");
		capabilities.setCapability("noReset", "true");


		//   URL url = new URL(get.getProperty("URL"));
		AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub/"),capabilities);
       //clcik on youtube button
		//driver.findElement(By.xpath("//android.widget.TextView[@index='23']")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Search\"]")).click();
		Thread.sleep(9000);
		
		driver.findElement(By.id("com.google.android.youtube:id/search_edit_text")).sendKeys("appwrk");
		Thread.sleep(4000);
		driver.findElements(By.id("com.google.android.youtube:id/text")).get(0).click();
	
		
		
	}

}