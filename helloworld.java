package basicweb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class helloworld {
	public static void main(String [] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Appwrk-22\\eclipse-workspace\\Start\\drivers\\chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(); 
		driver.get("http://dev.appwrk.com");
		driver.manage().window().maximize();
		String myTitle = driver.getTitle();
	System.out.println("Title is "+myTitle);
	String expected_Title="appwrk";
	Assert.assertEquals(myTitle, expected_Title);
	System.out.println("Test Completed ");
	}
	}

