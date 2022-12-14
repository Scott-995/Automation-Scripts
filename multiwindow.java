package basicweb;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class multiwindow {

	public static void main(String[] args) throws InterruptedException, IOException {

		WebDriver driver = new ChromeDriver(); 
		driver.get("https://rahulshettyacademy.com/angularpractice");
		driver.switchTo().newWindow(WindowType.TAB);

		Set <String> handles = driver.getWindowHandles();
		Iterator <String> it=handles.iterator();
		String parentWindowID = it.next();
		String childWindow=it.next();
		driver.switchTo().window(childWindow);

		driver.get("https://rahulshettyacademy.com");
		String Coursename =  driver.findElement(By.cssSelector("#courses-block > div:nth-child(1) > div > div.lower-content > div.upper-box > h2 > a")).getText();
		driver.switchTo().window(parentWindowID);
		WebElement name = driver.findElement(By.cssSelector("[name='name']"));
		name.sendKeys(Coursename);
		File files = name.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(files, new File("logo1.png"));

		Thread.sleep(2000);
		driver.quit();
	}

}
