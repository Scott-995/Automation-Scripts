package basicweb;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Second {
     
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Appwrk-22\\eclipse-workspace\\Start\\drivers\\chromedriver\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		driver.get("https:www.appwrk.com");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.id("menu-item-34640")).click();
		
        driver.findElement(By.name("YourName")).sendKeys("appwrk");
		
		driver.findElement(By.name("EmailAddress")).sendKeys("qwertyu@yahoo.in");
		driver.findElement(By.name("Phonenumber-cf7it-national")).sendKeys("9988012345");
		driver.findElement(By.name("Company")).sendKeys("appwrk");
		driver.findElement(By.name("YourMessage")).sendKeys("Learning step by step");
	
		driver.findElement(By.id("submit_varify")).sendKeys(Keys.RETURN);
		
		Thread.sleep(6000);	
		driver.quit();
		
	}
}
