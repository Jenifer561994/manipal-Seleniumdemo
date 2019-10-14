package learnSelenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertdemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Seleniumlp10software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
		
		//switching to alert
		Alert alert=driver.switchTo().alert();
		
		//Capturing alert message
		String alertmessage=driver.switchTo().alert().getText();
		
		//Displaying the alert message
		System.out.println(alertmessage);
		Thread.sleep(3000);
		
		//Accepting the alert
		alert.accept();
		
		driver.findElement(By.xpath("//a[contains(text(),'Alert with OK & Cancel')]")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		
		Alert alert1=driver.switchTo().alert();
		
		String alertmessage1=driver.switchTo().alert().getText();
		
		System.out.println(alertmessage1);
		Thread.sleep(3000);
		
		alert1.dismiss();
		
		
		driver.findElement(By.xpath("//a[contains(text(),'Alert with Textbox')]")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
		
		Alert alert2=driver.switchTo().alert();
		String alertmessage2=driver.switchTo().alert().getText();
		
		alert2.sendKeys("Rekha");
		System.out.println();
		alert2.accept();
		
		driver.quit();
		

	}

}
