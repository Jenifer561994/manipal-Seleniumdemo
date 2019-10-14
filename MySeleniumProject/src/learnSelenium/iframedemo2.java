package learnSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframedemo2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Seleniumlp10software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		
		List<WebElement>iframecount=driver.findElements(By.tagName("iframe"));
		System.out.println("No. of frames: "+iframecount.size());
		
		for(int i=0;i<iframecount.size();i++){
			System.out.println(iframecount.get(i).getAttribute("name"));
		}
		

	}

}
