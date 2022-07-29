package basicweb;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Popups {

    public static void main(String[] args) throws InterruptedException {
    	

WebDriver driver= new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://rahulshettyacademy.com/AutomationPractice/");
String name= "Dogesh";
driver.findElement(By.id("name")).sendKeys(name);
driver.findElement(By.id("alertbtn")).click();
Thread.sleep(2000);
System.out.println(driver.switchTo().alert().getText());
driver.switchTo().alert().accept();
Thread.sleep(2000);
driver.close();
    }

}