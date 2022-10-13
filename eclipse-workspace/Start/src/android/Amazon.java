package android;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebElement;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;


 
public class Amazon {
     
	AndroidDriver driver;
     
	public static void main(String[] args)  throws MalformedURLException, InterruptedException {
		
		  //  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
			 
				
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,"Pixel9");
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"Pixel9");
		//capabilities.setCapability(MobileCapabilityType.VERSION,"9.0");
		capabilities.setCapability("appPackage", "com.android.chrome");
		capabilities.setCapability("appActivity", "com.google.android.apps.chrome.Main");
		capabilities.setCapability("noReset", "true");
		capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"uiAutomator2");
     //	 AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub/"),capabilities);
        URL url =new URL ("http://127.0.0.1:4723/wd/hub/");
        AndroidDriver driver= new AndroidDriver(url,capabilities);
		driver.get("https://dev.appwrk.com");
		 
		Thread.sleep(35000);
		driver.findElement(By.id("mc-embedded-subscribe")).click();
		
	 

		//driver.findElement(By.xpath("//android.view.View[@resource-id='menu-item-14406']")).click();
		
	}
		

  } 
	
