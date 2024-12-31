package browserinitialize;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExample {

		
		public WebDriver driver;
		
		public void javascriptExample()
		{
			
			driver = new ChromeDriver();
			driver.navigate().to("https://www.amazon.in/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10));
			JavascriptExecutor exe = (JavascriptExecutor) driver;
			exe.executeScript("window.scrollBy(0,1000)"); //scroll down
			exe.executeScript("window.scrollBy(0,-500)"); //scroll up
			
		}
		
		public static void main(String[] args) {
			
			JavaScriptExample js = new JavaScriptExample();
			js.javascriptExample();

		}

}
