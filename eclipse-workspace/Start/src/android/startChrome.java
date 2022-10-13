package android;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.remote.DesiredCapabilities;

import com.google.common.collect.ImmutableMap;

import graphql.execution.nextgen.Common;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class startChrome {
	WebDriver Driver;
	public static   void main(String[] args)     throws MalformedURLException, InterruptedException {



		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"Pixel9");
		//capabilities.setCapability(MobileCapabilityType.VERSION,"9.0");
		capabilities.setCapability("appPackage", "com.android.chrome");
		capabilities.setCapability("appActivity", "com.google.android.apps.chrome.Main");
		capabilities.setCapability("noReset", "true");


		//   URL url = new URL(get.getProperty("URL"));
		AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub/"),capabilities);
	
		driver.get("https://dev.appwrk.com");
		Thread.sleep(20000);
		//driver.findElement(By.xpath("//android.widget.EditText[@index='0']")).click(); 
	//driver.findElement(By.xpath("//android.widget.EditText[@index='0']")).sendKeys("lucky01@gmail.com"); //appwrk
	driver.findElement(By.xpath("//android.widget.Button[@index='0']")).click();
	  // driver.findElement(By.id("identifierId")).sendKeys("appium");//gmail
	  //  driver.findElement(By.id("mc-embedded-subscribe")).click();// appwrk
	 // driver.findElement(By.xpath("//android.widget.TextView[@index='3']")).click();  
		
	}

}
