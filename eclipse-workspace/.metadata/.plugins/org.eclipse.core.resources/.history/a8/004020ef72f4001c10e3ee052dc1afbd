package basicweb;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestions {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
     driver.get("https://www.google.com/"); //entered the URL of Google
driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Indigo"); // given input of Indigo in Search bar
Thread.sleep(4000);
List<WebElement> auto= driver.findElements(By.xpath("//ul[@class='G43f7e']/li")); //captired the entire Auto-suggestion box
int count= auto.size(); //counted the total no. of elements in the Auto-suggestion box
System.out.println(count); //output of total elements in the auto-suggestion
auto.get(count-2).click(); //clicked the element in the 2nd last position of the auto-suggestion
    }

}