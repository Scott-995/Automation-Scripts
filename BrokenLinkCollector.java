package basicweb;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinkCollector {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Appwrk-22\\eclipse-workspace\\Start\\drivers\\chromedriver\\chromedriver.exe");
 
		WebDriver driver =new ChromeDriver();
		driver.get("https://dev.appwrk.com");
		driver.manage().window().maximize();

		List<WebElement> links= driver.findElements(By.tagName("a"));
		System.out.println(" Total links "+ links.size());
		
		List<String> urlList = new ArrayList<String>();
		for (WebElement e : links )
		{
			String url=e.getAttribute("href");
			urlList.add(url);
			//checkBrokenLink(url); 

		}
		long sTime = System.currentTimeMillis();
		
		urlList.parallelStream().forEach(e -> checkBrokenLink(e));
		long endTime =System.currentTimeMillis();
		System.out.println("total time taken" + (endTime-sTime) );
		driver.quit();	
	}

	public static void checkBrokenLink (String LinkUrl) {
		
		try {



			URL url =new URL(LinkUrl);
			HttpURLConnection httpUrlConnection = (HttpURLConnection) url.openConnection();
			httpUrlConnection.setConnectTimeout(5000);
			httpUrlConnection.connect();
			if (httpUrlConnection.getResponseCode() >=400)
			{
				System.out.println(LinkUrl +"--->" + httpUrlConnection.getResponseMessage() + " Is Broken Link");

			}
			else
			{
				System.out.println(LinkUrl +"--->" + httpUrlConnection.getResponseMessage());
			}
		}	

		catch (Exception e) 
		{
			
		}
		
	} 
 
}





