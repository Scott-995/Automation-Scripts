package basicweb;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class vVerifyBrokenImages {
         
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Appwrk-22\\eclipse-workspace\\Start\\drivers\\chromedriver\\chromedriver.exe");

		WebDriver driver =new ChromeDriver();
		driver.get("http://dev.appwrk.com");

		Thread.sleep(2000);
		List <WebElement> images= driver.findElements(By.tagName("img"));
		System.out.println(images.size());
		for (WebElement image : images) {
			String imageSrc =image.getAttribute("src");
			try
			{
				URL url =new URL(imageSrc);
				HttpURLConnection httpUrlConnection = (HttpURLConnection) url.openConnection();
				httpUrlConnection.setConnectTimeout(5000);
				httpUrlConnection.connect();
				if (httpUrlConnection.getResponseCode() >=200)

					System.out.println(imageSrc +"--->" + httpUrlConnection.getResponseMessage()+" good");


				else

					System.err.println(imageSrc +"--->" + httpUrlConnection.getResponseMessage());

				httpUrlConnection.disconnect();

			}
			catch (Exception e) {
				System.err.println(imageSrc);			
			}
		}
		driver.quit();
	}

}





