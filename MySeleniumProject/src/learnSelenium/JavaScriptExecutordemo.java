package learnSelenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutordemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Seleniumlp10software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();

		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		//Create a alert
		js.executeScript("alert('Do you want to proceed with login')");
		
		Thread.sleep(3000);
		
		//Handle alert
		Alert alert=driver.switchTo().alert();
		String alertmessage=driver.switchTo().alert().getText();
		System.out.println(alertmessage);
		alert.accept();
		
		
		//To print the url
		String urlname=js.executeScript("return document.URL").toString();
		System.out.println("The name of the website is: "+urlname);
		
		//To print the title
		String title=js.executeScript("return document.title").toString();
		System.out.println("The page title is: "+title);
		
		//To find the element and enter the value
		js.executeScript("document.getElementById('txtUsername').value='Admin'");
		
		//To refresh the page
		js.executeScript("history.go(0)");
		
		js.executeScript("document.getElementById('txtUsername').value='Admin'");
		
		
		
		WebElement property=(WebElement)js.executeScript("return document.getElementById('txtUsername')");
		System.out.println(property.getAttribute("value"));
		
		js.executeScript("document.getElementById('txtPassword').value='admin123'");
		
		js.executeScript("document.getElementById('btnLogin').click()");
		
		js.executeScript("document.getElementById('menu_leave_viewLeaveModule').click()");
		
		//scroll down
		
		//js.executeScript("window.scrollBy(0,400)");
		
		//scroll to the end of page
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
		String tablehtml=js.executeScript("return document.getElementById('resultTable').innerHTML").toString();
		System.out.println(tablehtml);
	}

}
