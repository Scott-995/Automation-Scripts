package basicweb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropdownsByLoop {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
driver.findElement(By.id("divpaxinfo")).click();
Thread.sleep(3000);
int adult= 5,i=1;
for(i=1; i<adult; i++) {
    driver.findElement(By.id("hrefIncAdt")).click();
}
driver.findElement(By.id("btnclosepaxoption")).click();
System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
    }

}