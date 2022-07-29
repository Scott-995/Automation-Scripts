package basicweb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class checktextboxinput {

	public static void main(String[] args) throws InterruptedException {


		WebDriver driver =new ChromeDriver();
		driver.get("https://dev.appwrk.com/contact-us");
		driver.manage().window().maximize();


		WebElement name = driver.findElement(By.name("Yourname"));
		name.sendKeys("pool");
		String n = name.getAttribute("value");
		System.out.println(n);
		System.out.println(name.getRect().getDimension().getHeight());
		System.out.println(name.getRect().getDimension().getWidth()); 

		WebElement dname  = driver.findElement(By.name("Phonenumber-cf7it-national"));
		dname.sendKeys("1234567890");
		String d = dname.getAttribute("value");
		System.out.println(d);

		WebElement cname = driver.findElement(By.name("email"));
		cname.sendKeys("qwerty@gmail.com");
		String c = cname.getAttribute("value");
		System.out.println(c);		           


		WebElement Button = driver.findElement(By.xpath("//input[@value='Submit']"));
		Button.click();

		Thread.sleep(3000);

		WebElement wButton = driver.findElement(By.xpath("//div[@class='ctc-analytics']"));
		System.out.println(wButton);
		wButton.click();

	}

}
