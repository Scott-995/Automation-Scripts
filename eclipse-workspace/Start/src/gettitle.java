import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class gettitle {

	public static void main(String[] args) {
		 WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Appwrk-22\\eclipse-workspace\\Start\\drivers\\chromedriver\\chromedriver.exe");
	  	 
	  	
	      driver = new ChromeDriver();
	      
	  	  String url = "https://dev.appwrk.com";
	  	  driver.get(url);
	    String Title = driver.getTitle();
	      System.out.println("The Title is " + Title);
	}

}