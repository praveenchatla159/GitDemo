package stepDefinitions;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.TakesScreenshot;




public class Browserinvoke {
	
	WebDriver driver;
	
	public  void browserStart() throws IOException, InterruptedException {
		
		
		
		WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		System.setProperty("webdriver.chrome.driver","D:\\FrameWorks\\BDD\\Drivers\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	
		ChromeOptions option = new ChromeOptions();

		option.setBrowserVersion("121");
	

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();
		
		//input[@type='email']
		
		
		WebElement eleEmail=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div[2]/div[2]/a[2]"));

		eleEmail.click();
		
	
		
		for (int i=0;i<4;i++)
		{
			eleEmail.click();
		
		
		}
		
		WebElement addTocart=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div[2]/div[3]/button"));
		
		addTocart.click();
		
		JavascriptExecutor executor= (JavascriptExecutor)driver;
		
		executor.executeScript("arguments[0].click();",addTocart);
		
		
		
		

		WebElement cartIcon=driver.findElement(By.xpath("//*[@alt='Cart']"));
		
		cartIcon.click();
		
		Thread.sleep(3000);
		
		WebElement proceedToCheckOut=driver.findElement(By.xpath("//*[text()='PROCEED TO CHECKOUT']"));
		
		
		WebDriverWait wait=new WebDriverWait(driver, 30);
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='PROCEED TO CHECKOUT']")));
		
		proceedToCheckOut.click();
		
		System.out.println("Execution Succesfull");
		
		

		
	
	 
		
		
		
		
		
		
	

	}
	
	
	
	
public static void main(String[] args) throws IOException, InterruptedException {
	
	Browserinvoke b=new Browserinvoke();
	
	b.browserStart();
}

}
