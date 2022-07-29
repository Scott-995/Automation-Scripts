package basicweb;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks1 {


	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Appwrk-22\\eclipse-workspace\\Start\\drivers\\chromedriver\\chromedriver.exe");

		WebDriver driver =new ChromeDriver();
		driver.get("https:dev.appwrk.com");
		driver.manage().window().maximize();

		List <WebElement> Links = driver.findElements(By.tagName("a"));
		System.out.println("Total links are =  "+ Links.size());
		for (int i = 0;i<Links.size();i++)
		{

			WebElement ele =Links.get(i);
			String url=ele.getAttribute("href");
			verifyLinkActive(url);
		}

		Thread.sleep(100);



	}

	public static void verifyLinkActive(String Linkurl) throws IOException {
		try {
			URL url = new URL(Linkurl);
			HttpURLConnection httpURLConnect = (HttpURLConnection)url.openConnection();
			httpURLConnect.setConnectTimeout(3000);	
			httpURLConnect.connect();

			if(httpURLConnect.getResponseCode()==200)
			{
				System.out.println(Linkurl+"--"+ httpURLConnect.getResponseMessage());

			}
			if(httpURLConnect.getResponseCode()==HttpURLConnection.HTTP_NOT_FOUND)
			{
				System.out.println(Linkurl+"--"+ httpURLConnect.getResponseMessage()+" - "+HttpURLConnection.HTTP_NOT_FOUND);
			}

		} catch (Exception e) {

		}

	}
}

