import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


import io.appium.java_client.touch.offset.PointOption;

public class fb {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Appwrk-22\\eclipse-workspace\\Start\\drivers\\chromedriver\\chromedriver.exe");

		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();


		driver.findElement(By.id("email")).sendKeys("Scott.k19950@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Sharma@1994");
		driver.findElement(By.name("login")).click();
		Thread.sleep(5000);


		// click in search bar
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div[2]/div[1]/div/div/div[3]/div/div/div/div/div/div/label/input")).click();
		Thread.sleep(2000);
		//	click in search bar
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div[2]/div[1]/div/div/div[3]/div/div/div/div[2]/div/div[2]/div[1]/div/ul/li[1]/div/a/div/div[2]/div/div/span/span")).click();
		// select 1st drop down
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[5]/div/div/div[3]/div/div/div[1]/div[1]/div[4]/div[2]/div/div[2]/div/div/div/div[2]/div/div/div/div/div/div/div/div/div/div[2]/div/div[4]/div/div/div[1]/div/div[2]/div/div[1]/div[1]/div[1]/div[2]/span")).click();
		Thread.sleep(6000);
		
		 JavascriptExecutor j = (JavascriptExecutor) driver;
	      j.executeScript("window.ScrollTo(0,1000);");

		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[5]/div/div/div[3]/div/div/div[1]/div[1]/div[1]/div[2]/div/div/div/div[3]/div/div/div/a/div/div[1]/div[2]/span/span")).click();
		//to like
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[5]/div/div/div[3]/div/div/div[1]/div[1]/div[4]/div[2]/div/div[2]/div/div/div/div[2]/div/div/div/div/div/div/div/div/div/div[2]/div/div[4]/div/div/div[1]/div/div[2]/div/div[1]/div[1]/div[1]/div[1]/span/i")).click();
		//emoji click
	//	driver.findElement(By.xpath("/div/div[1]/div[1]/div/div[1]/div/div/div/div[2]/div/div/div/div/div/div[1]/div/div[1]/div/div/canvas")).click();
		Thread.sleep(7000);



	}

}