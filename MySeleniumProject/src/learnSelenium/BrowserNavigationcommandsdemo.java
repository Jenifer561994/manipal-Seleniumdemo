package learnSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserNavigationcommandsdemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Seleniumlp10software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//To open the website
		driver.navigate().to("http://demowebshop.tricentis.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Log in")).click();
		
		//Go back to home page
		driver.navigate().back();
		
		//go forward to login page
		driver.navigate().forward();
		
		//Refresh page
		driver.navigate().refresh();
		
		Thread.sleep(5000);
		driver.close();

		
	}

}
