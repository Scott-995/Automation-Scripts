package basicweb;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Firstclass  {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Appwrk-22\\eclipse-workspace\\Start\\drivers\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://dev.appwrk.com");


		driver.findElement(By.className("default-btn")).click();

		driver.findElement(By.name("EMAIL")).sendKeys("Test1@gmail.com");

		driver.findElement(By.id("mc-embedded-subscribe")).click();

		
		driver.findElement(By.name("submit")).click();
		
		
   
		





		driver.close();


	}



}


