package T_Final;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import T_Final.Constants;

public class PageSetup {
	
 static WebDriver driver;
	
	@Before
	public void init() throws InterruptedException {
		ChromeOptions option=new ChromeOptions();
	     option.addArguments("--remote-allow-origins=*");
	     
	     option.addArguments("user-data-dir=C:\\Users\\Admin\\AppData\\Local\\Google\\Chrome\\User Data\\Default");
	     option.addArguments("--profile-directory=Default");
	     
	     System.setProperty("webdriver.chrome.driver", Constants.CHROME);
	     driver = new ChromeDriver(option);
	     driver.manage().window().maximize();
	     driver.navigate().to(Constants.BASE);
	     Thread.sleep(3000);
	     
	}
	@After
	public void exit () throws InterruptedException {
	Thread.sleep(3000);
		 driver.quit();
	}
}
