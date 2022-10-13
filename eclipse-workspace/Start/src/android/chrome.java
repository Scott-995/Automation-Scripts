package android;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class chrome {
     
    public static <AndroidElement> void main(String[] args) {
          
        //Set the Desired Capabilities
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", "Pixel22");
        caps.setCapability("platformName", "Android");
        caps.setCapability("chromeOption",ImmutableMap.of("w3c",false));
        caps.setCapability("appPackage", "com.android.vending");
        caps.setCapability("appActivity", "com.google.android.finsky.activities.MainActivity");
        caps.setCapability("noReset", "true");
        

        //Instantiate Appium Driver
        try {
        	AndroidDriver AndroidDriver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub/"),caps);
    		 
        } catch (MalformedURLException e) {
            System.out.println(e.getMessage());
        }
    }
}
