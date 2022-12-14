package basicweb;


import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinkTest {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Appwrk-22\\eclipse-workspace\\Start\\drivers\\chromedriver\\chromedriver.exe");

		WebDriver driver =new ChromeDriver();
		driver.get("https:dev.appwrk.com");
		driver.manage().window().maximize();

		Thread.sleep(4000);

		//capture links

		List<WebElement>links=driver.findElements(By.tagName("a"));
		//number of links
		System.out.println(links.size());
		for(int i=0;i<links.size();i++);

		{

			int i = 0;
			// using herf attribute we got url
			WebElement element= links.get(i);
			element.getAttribute("href");
			String url=element.getAttribute("href");

			URL link = new URL(url);

			// created connection using url object 'link'
			HttpURLConnection httpConn =(HttpURLConnection) link.openConnection();
			//wait time 2 sec
			Thread.sleep(2000);
			//establish connection
			httpConn.connect();

			int resCode=httpConn.getResponseCode();
			
			if(resCode>200)
			{
				System.out.println(url +" - "+" is broken link");
			}
			else
			{
				System.out.println(url +" - "+" is valid link");
			}


            
            


		}
	}

}
