package android;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class basic {

	public static <AndroidElement> void main(String[] args) throws MalformedURLException, InterruptedException {
		
		File f = new File("src");
		File fs = new File(f,"ApiDemos 17_v' platformBuildVersionName=_apkpure.com.apk");   
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel9" );
        cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,"uiAutomator2");
		cap.setCapability(MobileCapabilityType.APP,fs.getAbsolutePath());
       AndroidDriver driver =new AndroidDriver(new URL ("http://127.0.0.1:4723/wd/hub"),cap);

   Thread.sleep(7000);
      // WebElement locator = (WebElement) driver.findElements(By.id("android:id/text1")).get(1);
      // driver.findElements(By.id("android:id/text1")).get(0);
     // driver.findElement(By.id("android:id/text1")).click();
	  driver.findElement(By.xpath("//android.widget.TextView[@index='1']")).click(); 
	  driver.findElement(By.id("android:id/text1")).click();
	  driver.findElement(By.xpath("//android.widget.TextView[@index='0']")).click();
	  driver.findElement(By.xpath("//android.view.View[@index='0']")).click();
	  driver.findElement(By.xpath("//android.view.View[@index='0']")).click();
	  driver.findElement(By.xpath("//android.view.View[@index='0']")).click();
	  
	  
	}

}
