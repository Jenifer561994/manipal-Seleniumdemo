package learnSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Registrationtest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Seleniumlp10software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Register.html");
		
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Rekha");
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("B");
		driver.findElement(By.xpath("//textarea[@class='form-control ng-pristine ng-untouched ng-valid']")).sendKeys("Indiranagar");
		driver.findElement(By.xpath("//input[@class='form-control ng-pristine ng-untouched ng-valid-email ng-invalid ng-invalid-required']")).sendKeys("rekha@gmail.com");
		driver.findElement(By.xpath("//input[@class='form-control ng-pristine ng-untouched ng-invalid ng-invalid-required ng-valid-pattern']")).sendKeys("87654366");
		driver.findElement(By.xpath("//*[@name='radiooptions' and @value='FeMale']")).click();
		driver.findElement(By.xpath("//input[@id='checkbox2']")).click();
		
		//Select year
		WebElement yy= driver.findElement(By.xpath("//select[@id='yearbox']"));
		Select sel=new Select(yy);
		sel.selectByVisibleText("1930");
		
		//select month
		WebElement mth=driver.findElement(By.xpath("//select[@placeholder='Month']"));
		Select sel1=new Select(mth);
		
		//To find the size
		List<WebElement> lst3=sel1.getOptions();
		System.out.println(lst3.size());
		
		//To print the values of drop down in console
		for(int i=0;i<lst3.size();i++) 
		{
			System.out.println(lst3.get(i).getText());
		}
		
		sel1.selectByIndex(4);
		
		//select day
		WebElement day=driver.findElement(By.xpath("//select[@id='daybox']"));
		Select sel2=new Select(day);
		sel2.selectByValue("3");

	}

}
