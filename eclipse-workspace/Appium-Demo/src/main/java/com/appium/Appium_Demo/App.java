package com.appium.Appium_Demo;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

/**
 * Hello world!
 *
 */
public class App 
{	AndroidDriver driver;

public static void main(String[] args)  throws MalformedURLException, InterruptedException {
	
	  //  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
		 
			
	DesiredCapabilities capabilities = new DesiredCapabilities();
	capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,"52108172ba5b840f");
	capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"Pixel9");
	//capabilities.setCapability(MobileCapabilityType.VERSION,"9.0");
	capabilities.setCapability("appPackage", "com.android.chrome");
	capabilities.setCapability("appActivity", "com.google.android.apps.chrome.Main");
	capabilities.setCapability("noReset", "true");
	capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"uiAutomator2");
//	 AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub/"),capabilities);
   URL url =new URL ("http://127.0.0.1:4723/wd/hub/");
   AndroidDriver<WebElement> driver= new AndroidDriver<WebElement>(url,capabilities);
	driver.get("https://dev.appwrk.com");
	 
	Thread.sleep(38000);
	//driver.findElement(By.id("mc-embedded-subscribe")).click();
	MobileElement element = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().resourceId(\"com.android.vending:id/tab_recycler_view\")).getChildByText("
	        +"new UiSelector().className(\"android.widget.TextView\"),\"Subscribe\")"));


	driver.findElement(By.xpath("//android.view.View[@resource-id='menu-item-14406']")).click();

	
}
	

} 

