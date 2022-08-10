package android;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class mindsapp {

	public static void main(String[] args) throws MalformedURLException, InterruptedException  {
		 
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"Pixel10");
		
		capabilities.setCapability("appPackage", "com.minds.mobile");
		capabilities.setCapability("appActivity","com.minds.mobile.MainActivity");
    	capabilities.setCapability("noReset", "true");
		
		AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub/"),capabilities);
		Thread.sleep(15000);
		// click on login
		driver.findElement(By.xpath("//android.widget.TextView[@index=0]")).click();

		//	user name 	need to check
		driver.findElement(By.xpath("android.view.ViewGroup[@index=1")).sendKeys("Scott1234");
		// Password
		driver.findElement(By.xpath("//android.view.ViewGroup[@index=2]")).sendKeys("Sharma@1994");
		// click login
		driver.findElement(By.xpath("//android.view.ViewGroup[@index=0]")).click();


	}

}
