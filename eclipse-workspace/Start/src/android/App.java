package android;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;


import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

//import io.appium.java_client.AppiumBy;
//import io.appium.java_client.FindsByAndroidUIAutomator;
//import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
//import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.offset.PointOption;
 

public class App {
  AndroidDriver Driver;
	
  
  
  // SCROLL DOWN	
	
  
  
  public static void main(String[] args) throws MalformedURLException, InterruptedException {

		File f = new File("src");
		File fs = new File(f,"ApiDemos 17_v' platformBuildVersionName=_apkpure.com.apk");   
		DesiredCapabilities cap = new DesiredCapabilities();                                 
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel9" );
		//cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,"uiAutomator2");
		cap.setCapability(MobileCapabilityType.APP,fs.getAbsolutePath());
		AndroidDriver driver =new AndroidDriver(new URL ("http://127.0.0.1:4723/wd/hub"),cap);

     
// scroll down in app and click on it
		Thread.sleep(6000);
		driver.findElement(By.xpath("//android.widget.Button[@index='1']")).click();
				
		driver.findElement(By.xpath("//android.widget.TextView[@index='10']")).click(); 
	TouchAction swipe =new TouchAction(driver).press(PointOption.point(509, 1746)).moveTo(PointOption.point(494, 503)).release().perform();
	TouchAction swipe2 =new TouchAction(driver).press(PointOption.point(509, 1746)).moveTo(PointOption.point(494, 503)).release().perform();
	TouchAction swipe3  =new TouchAction(driver).press(PointOption.point(509, 1746)).moveTo(PointOption.point(494, 503)).release().perform();
	
	  Thread.sleep(6000);
	  driver.findElement(By.xpath("//android.widget.TextView[@index='12']")).click();
	//AndroidElement list =(AndroidElement) driver.findElements(By.id("android:id/text1"));//
			//Thread.sleep(5000);
			//	MobileElement listitem =(MobileElement) driver.findElement(
			//			new AppiumBy.ByAndroidUIAutomator( "new UiScrollable(new UiSelector().resourceId(\"com.android.vending:id/tab_recycler_view\")).getChildByText("
			//			        + "new UiSelector().className(\"android.widget.TextView\"), \"WebView\")"));
				
				
			//		System.out.println(listitem.getLocation());
			//		listitem.click();
	// AndroidDriver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+visibleText+"\").instance(0))").click();
			  driver.findElement(By.xpath("//android.widget.TextView[@index='12']")).click();
				//driver.findElement(By.xpath("//android.widget.TextView[@index='1']")).click();
				//driver.findElement(By.id("com.github.axet.android.apis:id/edit")).sendKeys("appwrk");
				//driver.findElement(By.id("com.github.axet.android.apis:id/check1")).click();
				//driver.findElement(By.id("com.github.axet.android.apis:id/radio1")).click();
				}

	}


