package browserinitialize;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {

	public WebDriver driver; //Declaration for Webdriver. Webdriver is an interface
	
	
	public void browserinitialization() {
		
		//Initializing the Browser
		//driver=new EdgeDriver();
		//driver=new FirefoxDriver();
		
		//SinceWebDriver is an interface, creating obj using upcasting
		driver=new ChromeDriver(); //ChromeDriver, FireFoxDriver, SafariDriver etc. are child for the webDriver interface. Thus creating obj for required browser (child) to access its methods
		driver.get("https://selenium.qabible.in/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(20));//apply in all child classes -implicit wait
	}
	
	public void browserClose() {
		driver.close();//it will close only the latest window in the current session 		
	}
	public void browserQuit() {
		driver.quit();//it will close all the existing open windows launched by the current session
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Base base=new Base();
		base.browserinitialization();
		//base.browserClose();
		//base.browserQuit();
		
	}

}
