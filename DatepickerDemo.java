package basicweb;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatepickerDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.booking.com/");
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/form/div[1]/div[2]/div[1]/div[2]/div/div/div/div/span")).click();
		String checkInMonth = "August 2022";
		String DateVal = "28";
		
		while(true){
			String month =	driver.findElement(By.xpath("(//div[@class='bui-calendar__month'])[2]")).getText();
			if(month.equals(checkInMonth)){

				break;

			}
			else {

				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/form/div[1]/div[2]/div[2]/div/div/div[3]/div[1]")).click();

			}
		List <WebElement> ele =	driver.findElements(By.xpath("(//tbody)[1]//tr//td/span"));
		
		
		for(WebElement element:ele) {
			
		String date =	element.getText();
		if(date.equals(DateVal)) {
			element.click();
			break;
		}
			
			
		}
		}



	}

}
