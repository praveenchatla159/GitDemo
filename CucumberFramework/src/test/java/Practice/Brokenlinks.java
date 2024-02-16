package Practice;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Brokenlinks {



	public void brokenLinkJava() {

		WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		System.setProperty("webdriver.chrome.driver","D:\\FrameWorks\\BDD\\Drivers\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		ChromeOptions option = new ChromeOptions();


		driver.get("https://google.com");
		driver.manage().window().maximize();

		List<WebElement>  links=driver.findElements(By.tagName("a"));

		//System.out.println("Total Links found in Google is:"+links.size());


		for (WebElement link:links)
		{
			String url=link.getAttribute("href");

			if (url!=null && !url.isEmpty())
			{
				try 
				{


					HttpURLConnection connection = (HttpURLConnection) (new URL(url).openConnection());
					connection.setRequestMethod("Head");
					connection.connect();
					int responseCode=connection.getResponseCode();
				
					if (responseCode <= 400) {
						System.out.println("Broken Link: " + url + " - Response Code: " + responseCode);
					} else {
						System.out.println("Valid Link: " + url);
					}
					connection.disconnect();
				}

				catch (Exception e)
				{
					System.out.println("Exception occurred while checking the link: " + url);
				}
			}

		}


	}

	public static void main(String[] args) {

		Brokenlinks b=new Brokenlinks();
		b.brokenLinkJava();

	}

}
