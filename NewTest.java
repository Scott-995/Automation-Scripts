package basicweb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;



public class NewTest {
	
  @Test(priority=1,description="Logiin")
  public void f() {
int a = 8;	
int b = 4;
int c = a+b;
	 
     System.out.println(c);
  Assert.assertEquals(11, 11);
  }
  @Test(priority=2)
     public void t() {
             System.out.println("Hello new Learning");
             
     }
  @Test(priority=3)
  public void C() {
	  System.out.println("Gabby is best");
  }
}
