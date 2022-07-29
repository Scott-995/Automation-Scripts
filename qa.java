package basicweb;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class qa {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");// URL of the website
		WebElement staticDropdown= driver.findElement(By.id("dropdown-class-example"));// 
		Select select= new Select(staticDropdown);
		//select.selectByIndex(2); //selecting the value of the element present in the 2nd index
		//System.out.println(select.getFirstSelectedOption().getText());
		select.selectByVisibleText("Option3");    // selected "OPTION3" USING SELECT BY VISIBLE TEXT METHOD
		System.out.println(select.getFirstSelectedOption().getText());
	}

}