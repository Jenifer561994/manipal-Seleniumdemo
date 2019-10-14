package learnSelenium;


import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class log4jdemo {
	public static void main(String[] args) {
		Logger log = Logger.getLogger(log4jdemo.class); // class name
		System.setProperty("webdriver.chrome.driver", "D:\\Seleniumlp10software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		log.info("Launch Browser");
				
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		log.info("URL launched");
		
		String title = driver.getTitle();
		System.out.println("Title value is: " + title);
		log.info("title value is:" + title);
		
		if(title.equals("google")){
			System.out.println("correct title is Google");
			log.info("Correct title: Test case passed");
		}
		else{
			System.out.println("Incorrect title");
			log.error("Incorrect title: Test case failed");
			log.warn("ensure u have opened the correct page");
			log.fatal("Wrong page");
		}
		driver.quit();
	

	}

}
