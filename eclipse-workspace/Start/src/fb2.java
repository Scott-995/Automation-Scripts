import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fb2 {

	public static void main () throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Appwrk-22\\eclipse-workspace\\Start\\drivers\\chromedriver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();


		driver.findElement(By.id("email")).sendKeys("Scott.k19950@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Sharma@1994");
		driver.findElement(By.name("login")).click();
		Thread.sleep(5000);
	}
}
