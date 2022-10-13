import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

class s {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Appwrk-22\\eclipse-workspace\\Start\\drivers\\chromedriver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();


		driver.findElement(By.id("email")).sendKeys("Scott.k19950@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Sharma@1994");
		driver.findElement(By.name("login")).click();
		Thread.sleep(5000);

		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div[2]/div[1]/div/div/div[3]/div/div/div/div/div/div/label/input")).sendKeys("Appwrk", Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/h2[1]/span[1]/span[1]/span[1]/a[1]/span[1]")).click();
		Thread.sleep(4000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,1000);");
		Thread.sleep(4000);
		// hover action
//		Actions hover = new Actions(driver);
//
//		WebElement Elem_to_hover = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[5]/div/div/div[3]/div/div/div[1]/div[1]/div[4]/div[2]/div/div[2]/div/div/div/div[1]/div/div/div/div/div/div/div/div/div/div[2]/div/div[4]/div/div/div[1]/div/div[2]/div/div[1]/div[1]/div[1]"));
//
//		hover.moveToElement(Elem_to_hover);
//
//		hover.build();
//
//		hover.perform();
		
	driver.findElement(By.xpath(" /html/body/div[1]/div/div[1]/div/div[5]/div/div/div[3]/div/div/div[1]/div[1]/div[4]/div[2]/div/div[2]/div/div/div/div[1]/div/div/div/div/div/div/div/div/div/div[2]/div/div[3]/div[2]/div[1]/div/a/div[1]/div/div/div/img")).click();

	}

}
