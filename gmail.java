package basicweb;

import org.openqa.selenium.By;
import  org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class gmail {

	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Appwrk-22\\eclipse-workspace\\Start\\drivers\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		 driver.get("https://www.gmail.com");
		 String ti = driver.getTitle();
		 System.out.println(ti);
         driver.manage().window().maximize();
         
         driver.findElement(By.className("daaWTb")).click();
         driver.findElement(By.className("VfPpkd-StrnGf-rymPhb-b9t22c")).click();
         driver.findElement(By.name("firstName")).sendKeys("THOR");
         driver.findElement(By.id("lastName")).sendKeys("AVENGER");
         driver.findElement(By.id("username")).sendKeys("appwrk1010");
         
         driver.findElement(By.name("Passwd")).sendKeys("AppWrk@1234");
         driver.findElement(By.name("ConfirmPasswd")).sendKeys("AppWrk@1234");
         driver.findElement(By.className("VfPpkd-muHVFf-bMcfAe")).click();
         //driver.findElement(By.xpath("class="))
         //driver.findElement(By.name("identifier")).sendKeys("Test123@gmail.com");
        
		 //driver.findElement(By.className("VfPpkd-vQzf8d")).sendKeys(Keys.RETURN);
         Thread.sleep(2000);
		 String at = driver.getTitle();
		 System.out.println(at);
		 String et = "gmail";
		 if(at.equalsIgnoreCase(et))
		 {
			 System.out.println("Test Sucessful");
		 }
	     else
	     {
	    	 System.out.println("Not sucessful as we want name as 'gmail' ");
	     }



		driver.close();

	}

}
