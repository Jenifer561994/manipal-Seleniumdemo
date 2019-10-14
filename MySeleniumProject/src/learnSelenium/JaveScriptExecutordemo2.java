package learnSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JaveScriptExecutordemo2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Seleniumlp10software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//scroll to a particular element
		
		js.executeScript("document.getElementById('firstpassword').scrollIntoView()");
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//a[contains(text(),'Practice Site')]")).click();
		
		
		
		//navigate backward
		js.executeScript("window.history.back()");
		
		
		
		//navigate forward
		js.executeScript("window.history.forward()");
		
		js.executeScript("window.close()");
		
	}

}
