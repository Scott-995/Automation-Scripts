package basicweb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;




public class Basic1 {

	        public static void main(String[] args) throws InterruptedException {
//			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Appwrk-22\\eclipse-workspace\\Start\\drivers\\chromedriver\\chromedriver.exe");

			WebDriver driver =new ChromeDriver();
			driver.get("https://dev.appwrk.com/contact-us");
			Thread.sleep(6000);

			driver.manage().window().maximize();


			
           WebElement name = driver.findElement(By.name("Yourname"));
           name.sendKeys("pooll");  
           //get height and width 
           System.out.println(name.getRect().getDimension().getHeight());
           System.out.println(name.getRect().getDimension().getWidth());
         	String n = name.getAttribute("value");
	    	System.out.println(n);
            
		WebElement dname  = driver.findElement(By.name("Phonenumber-cf7it-national"));
            dname.sendKeys("124532657898");
            System.out.println(dname.getRect().getDimension().getHeight());
            System.out.println(dname.getRect().getDimension().getWidth());
            String d = dname.getAttribute("value");
    		System.out.println(d);
            
            WebElement cname = driver.findElement(By.name("email"));
            cname.sendKeys("qwerty@gmail.com");
            System.out.println(cname.getRect().getDimension().getHeight());
            System.out.println(cname.getRect().getDimension().getWidth());
        	String c = cname.getAttribute("value");
    		System.out.println(c);		           

            WebElement Button = driver.findElement(By.xpath("//input[@value='Submit']"));
            Button.click();
            System.out.println(Button.getRect().getDimension().getHeight());
            System.out.println(Button.getRect().getDimension().getWidth());
           // Thread.sleep(5000);
            
            WebElement wButton = driver.findElement(By.xpath("//div[@class='ctc-analytics']"));
    		System.out.println(wButton);
    		wButton.click();

           
            
            
     
				}

}
