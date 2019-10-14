package learnSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathdemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Seleniumlp10software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Register.html");
        //driver.findElement(By.xpath("//input[@type='text'][last()]")).sendKeys("sharma");
        
        driver.findElement(By.xpath("//a[contains(text(),'SwitchTo')]//parent::li//preceding-sibling::li//a[contains(text(),'WebTable')]")).click();
	}

}
