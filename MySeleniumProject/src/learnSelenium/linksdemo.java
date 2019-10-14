package learnSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class linksdemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Seleniumlp10software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//To open the website
		driver.navigate().to("http://demowebshop.tricentis.com/");
		
		driver.manage().window().maximize();
		
		List<WebElement>linklist=driver.findElements(By.tagName("a"));
		System.out.println("Number of links in application is: "+linklist.size());
		
		for(int i=0;i<linklist.size();i++){
			System.out.println(linklist.get(i).getText());
		}
		
		driver.close();

	}

}
