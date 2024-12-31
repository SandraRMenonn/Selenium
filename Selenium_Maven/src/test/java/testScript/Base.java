package testScript;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;




public class Base {
	WebDriver driver;	
	
  
  @BeforeMethod  //Any global test case which needs to be run before all TC
  public void beforeMethod() {
	  driver = new ChromeDriver();
	  driver.navigate().to("https://selenium.qabible.in/index.php");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(20));}
	  
  @AfterMethod
  public void afterMethod() {
  
  driver.quit();
  }
}
