<<<<<<< HEAD
package basicweb;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class mind {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Appwrk-22\\eclipse-workspace\\Start\\drivers\\chromedriver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.minds.com/login");
		driver.manage().window().maximize();


		driver.findElement(By.id("username")).sendKeys("Scott1234");
		driver.findElement(By.id("password")).sendKeys("Sharma@1994");
		driver.findElement(By.xpath("/html/body/m-app/m-page/m-body/div/div/m-login/div/div/div/m-loginform/form/div[2]/m-button/button/div")).click();
		Thread.sleep(4000);
		//click on like button 
		driver.findElement(By.xpath("/html/body/m-app/m-page/m-body/div/div/m-newsfeed/div/div/m-newsfeed--subscribed/div/div/m-activity[1]/m-activity__toolbar/div/minds-button-thumbs-up/a/span")).click();
        //	click on comment text box	
     	driver.findElement(By.xpath("/html/body/m-app/m-page/m-body/div/div/m-newsfeed/div/div[1]/m-newsfeed--subscribed/div/div/m-activity[1]/m-comments__entityoutlet/m-comment__poster/div/div/form/m-text-input--autocomplete-container/minds-textarea/div")).click();
//	provide input in comment box
     	driver.findElement(By.xpath("/html/body/m-app/m-page/m-body/div/div/m-newsfeed/div/div[1]/m-newsfeed--subscribed/div/div/m-activity[1]/m-comments__entityoutlet/m-comment__poster/div/div/form/m-text-input--autocomplete-container/minds-textarea/div")).sendKeys("best");
//		click on send key
       driver.findElement(By.xpath("/html/body/m-app/m-page/m-body/div/div/m-newsfeed/div/div[1]/m-newsfeed--subscribed/div/div/m-activity[1]/m-comments__entityoutlet/m-comment__poster/div/div/div[2]/div[1]/a/i")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,500);");
		
		Thread.sleep(2000);
		// click on comment
		//driver.findElement(By.xpath("/html/body/m-app/m-page/m-body/div/div/m-newsfeed/div/div[1]/m-newsfeed--subscribed/div/div/m-activity[1]/m-activity__toolbar/div/minds-button-comment/a/i")).click();
		//Thread.sleep(4000);
	//  click on 3 dots
		//driver.findElement(By.xpath("/html/body/m-app/m-page/m-body/div/div/m-newsfeed/div/div[1]/m-newsfeed--subscribed/div/div/m-activity[1]/m-comments__entityoutlet/m-comments__tree/m-comments__thread/div/m-comment[1]/div/div[2]/div[4]/m-dropdownmenu/span/i")).click();
// click on delete icon
		//driver.findElement(By.xpath("/html/body/m-app/m-page/m-body/div/div/m-newsfeed/div/div[1]/m-newsfeed--subscribed/div/div/m-activity[1]/m-comments__entityoutlet/m-comments__tree/m-comments__thread/div/m-comment[1]/div/div[2]/div[4]/m-dropdownmenu/div/ul/m-dropdownmenu__item[3]/li/span")).click();
	//	rest handle popup 
		//Thread.sleep(1000);
		driver.quit();   
		
		
		

	}

}
=======
package basicweb;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class mind {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Appwrk-22\\eclipse-workspace\\Start\\drivers\\chromedriver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.minds.com/login");
		driver.manage().window().maximize();


		driver.findElement(By.id("username")).sendKeys("Scott1234");
		driver.findElement(By.id("password")).sendKeys("Sharma@1994");
		driver.findElement(By.xpath("/html/body/m-app/m-page/m-body/div/div/m-login/div/div/div/m-loginform/form/div[2]/m-button/button/div")).click();
		Thread.sleep(4000);
		//click on like button 
		driver.findElement(By.xpath("/html/body/m-app/m-page/m-body/div/div/m-newsfeed/div/div/m-newsfeed--subscribed/div/div/m-activity[1]/m-activity__toolbar/div/minds-button-thumbs-up/a/span")).click();
        //	click on comment text box	
     	driver.findElement(By.xpath("/html/body/m-app/m-page/m-body/div/div/m-newsfeed/div/div[1]/m-newsfeed--subscribed/div/div/m-activity[1]/m-comments__entityoutlet/m-comment__poster/div/div/form/m-text-input--autocomplete-container/minds-textarea/div")).click();
//	provide input in comment box
     	driver.findElement(By.xpath("/html/body/m-app/m-page/m-body/div/div/m-newsfeed/div/div[1]/m-newsfeed--subscribed/div/div/m-activity[1]/m-comments__entityoutlet/m-comment__poster/div/div/form/m-text-input--autocomplete-container/minds-textarea/div")).sendKeys("best");
//		click on send key
       driver.findElement(By.xpath("/html/body/m-app/m-page/m-body/div/div/m-newsfeed/div/div[1]/m-newsfeed--subscribed/div/div/m-activity[1]/m-comments__entityoutlet/m-comment__poster/div/div/div[2]/div[1]/a/i")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,500);");
		
		Thread.sleep(2000);
		// click on comment
		//driver.findElement(By.xpath("/html/body/m-app/m-page/m-body/div/div/m-newsfeed/div/div[1]/m-newsfeed--subscribed/div/div/m-activity[1]/m-activity__toolbar/div/minds-button-comment/a/i")).click();
		//Thread.sleep(4000);
	//  click on 3 dots
		//driver.findElement(By.xpath("/html/body/m-app/m-page/m-body/div/div/m-newsfeed/div/div[1]/m-newsfeed--subscribed/div/div/m-activity[1]/m-comments__entityoutlet/m-comments__tree/m-comments__thread/div/m-comment[1]/div/div[2]/div[4]/m-dropdownmenu/span/i")).click();
// click on delete icon
		//driver.findElement(By.xpath("/html/body/m-app/m-page/m-body/div/div/m-newsfeed/div/div[1]/m-newsfeed--subscribed/div/div/m-activity[1]/m-comments__entityoutlet/m-comments__tree/m-comments__thread/div/m-comment[1]/div/div[2]/div[4]/m-dropdownmenu/div/ul/m-dropdownmenu__item[3]/li/span")).click();
	//	rest handle popup 
		//Thread.sleep(1000);
		driver.quit();   
		
		
		

	}

}
>>>>>>> e1f8364351427c214922189b48ff09b56ee50e35
