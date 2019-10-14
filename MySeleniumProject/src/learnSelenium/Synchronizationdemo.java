package learnSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Synchronizationdemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Seleniumlp10software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//To open the website
		driver.navigate().to("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.name("userName")).sendKeys("rekha");
		driver.findElement(By.name("password")).sendKeys("rekha");
		driver.findElement(By.xpath("//input[@name='login']")).click();

		WebDriverWait signoffwait=new WebDriverWait(driver, 10);
		signoffwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'SIGN-OFF')]")));
		driver.findElement(By.xpath("//a[contains(text(),'SIGN-OFF')]")).click();
	}

}
