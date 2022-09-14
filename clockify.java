package basicweb;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class clockify {
	WebDriver driver; 
	@BeforeTest
//	public static  void main(String[] args) throws InterruptedException, IOException {
	public void steven () throws InterruptedException {		
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Appwrk-22\\eclipse-workspace\\Start\\drivers\\chromedriver\\chromedriver.exe");
//		ChromeOptions chromeOptions = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver(chromeOptions);
    	driver =new ChromeDriver();
		driver.get("https://clockify.appwrk.com/login");
		driver.manage().window().maximize();
	}
		//	login
		@Test
		public void Abc() throws InterruptedException {
		driver.findElement(By.xpath("/html/body/app-root/mat-drawer-container/mat-drawer-content/app-login/div/div[1]/div/mat-card/form/mat-card-content/mat-form-field[1]/div/div[1]/div/input")).sendKeys("sandy@appwrk.com");
		
		//  password	
		driver.findElement(By.xpath("/html/body/app-root/mat-drawer-container/mat-drawer-content/app-login/div/div[1]/div/mat-card/form/mat-card-content/mat-form-field[2]/div/div[1]/div[1]/input")).sendKeys("12345678");
//  click on login button
		driver.findElement(By.xpath("/html/body/app-root/mat-drawer-container/mat-drawer-content/app-login/div/div[1]/div/mat-card/form/button")).click();  
Thread.sleep(4000);
		//  write in text box
		driver.findElement(By.xpath("/html/body/app-root/mat-drawer-container/mat-drawer-content/app-trackers/div/div[2]/mat-card/form/div/div[1]/mat-form-field/div/div[1]/div/input")).click();
		driver.findElement(By.xpath("/html/body/app-root/mat-drawer-container/mat-drawer-content/app-trackers/div/div[2]/mat-card/form/div/div[1]/mat-form-field/div/div[1]/div/input")).sendKeys("tesing scott by automation script1");
//  click on project
		driver.findElement(By.xpath("/html/body/app-root/mat-drawer-container/mat-drawer-content/app-trackers/div/div[2]/mat-card/form/div/div[2]/mat-form-field/div/div[1]/div/mat-select/div")).click();
//select from drop-down
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div/mat-optgroup[2]/mat-option[1]/span")).click();
//	select fixed or internal
		driver.findElement(By.id("mat-select-value-3")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div/mat-option[1]/span")).click();
//	select start time
		driver.findElement(By.xpath("/html/body/app-root/mat-drawer-container/mat-drawer-content/app-trackers/div/div[2]/mat-card/form/div/div[4]/div/input[1]")).click();
		Thread.sleep(2000);
//		start time
		driver.findElement(By.xpath("/html/body/ngx-material-timepicker-container/div[2]/ngx-material-timepicker-content/div/div/div[1]/div/ngx-material-timepicker-12-hours-face/ngx-material-timepicker-face/div/div/div[5]/span")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/ngx-material-timepicker-container/div[2]/ngx-material-timepicker-content/div/div/div[2]/div[2]/ngx-material-timepicker-button/button/span")).click();
		Thread.sleep(4000);
//	click on end time
		driver.findElement(By.xpath("/html/body/app-root/mat-drawer-container/mat-drawer-content/app-trackers/div/div[2]/mat-card/form/div/div[4]/div/input[2]")).click();
//	enter time
	driver.findElement(By.xpath("/html/body/ngx-material-timepicker-container/div[2]/ngx-material-timepicker-content/div/div/div[1]/div/ngx-material-timepicker-12-hours-face/ngx-material-timepicker-face/div/div/div[6]/span")).click();
	Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/ngx-material-timepicker-container/div[2]/ngx-material-timepicker-content/div/div/div[2]/div[2]/ngx-material-timepicker-button/button/span")).click();
// click on add button
	    driver.findElement(By.xpath("/html/body/app-root/mat-drawer-container/mat-drawer-content/app-trackers/div/div[2]/mat-card/form/div/div[7]/div/button")).click();
//	    entry submitted by automation	
		}
		
		@Test
		public void delete() throws InterruptedException {
			 Thread.sleep(5000);
			driver.findElement(By.xpath("/html/body/app-root/mat-drawer-container/mat-drawer-content/app-trackers/div/div[3]/div[1]/table/tbody/tr[1]/td[6]/div/mat-icon[2]")).click();
			 Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/mat-dialog-container/confirm-dialog/div[2]/button[2]")).click();
      
		}
		
		@Test 
		public void verify () {
			
			WebElement element = driver.findElement(By.xpath("/html/body/app-root/mat-drawer-container/mat-drawer-content/app-trackers/div/div[3]/div[1]/table/tbody/tr[1]"));
		
			System.out.println(element.isDisplayed());
			System.out.println(element.getText());
		}
		@AfterTest
	    public void quit () {
	    	 driver.close();
	     }
	}
	

