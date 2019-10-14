package learnSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBrowsercommandsdemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Seleniumlp10software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/login");
		
		//To print the title 
		String titlename=driver.getTitle();
		System.out.println(titlename);
		
		//find the title length
		int titlelength=driver.getTitle().length();
		System.out.println(titlelength);
		
		String urlname=driver.getCurrentUrl();
		System.out.println(urlname);
		
		if(urlname.equals(titlename)){
			System.out.println("Matched");
		}
		else{
			System.out.println("Not matched");
		}
		//String page=driver.getPageSource();
		//System.out.println(page);
		
		driver.close();
		

	}

}
