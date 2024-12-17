package browserinitialize;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowHandling  {

	public WebDriver driver;
	
	public void multipleWindow() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://webdriveruniversity.com/"); //Parent Window
		WebElement contactUs=driver.findElement(By.xpath("//h1[text()='CONTACT US']"));
		contactUs.click();
		WebElement loginPortal=driver.findElement(By.xpath("//h1[text()='LOGIN PORTAL']"));
		loginPortal.click();
		
		String parent=driver.getWindowHandle(); //To handle Parent window
		System.out.println(parent); 
		
		Set<String> allWindow=driver.getWindowHandles(); //To handle all the open windows
		String title=""; //initializing 'title' with no value, to use it below for storing titles
		for(String all:allWindow) { //this will iterate all the windows opened
			if(!all.equals(parent)) {  //To exclude parent window handling, as parent is already handled
				System.out.println(all);
				driver.switchTo().window(all); //in each iteration it will Switch to each window 
			//	System.out.println(driver.getTitle());
				title=driver.getTitle(); //this will get the title of the window in that iteration
				
			}
			if(title.equals("WebDriver | Contact Us")) { //if the window in the iteration matches this, it will do below
				WebElement firstName=driver.findElement(By.xpath("//input[@name='first_name']"));
				firstName.sendKeys("Sandra");
			}
			if(title.equals("WebDriver | Login Portal")) {  //if the window in the iteration matches this, it will do below
				WebElement loginUsername=driver.findElement(By.xpath("//input[@placeholder='Username']"));
				loginUsername.sendKeys("Sandra");
			}
		}
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultipleWindowHandling multiple=new MultipleWindowHandling();
		multiple.multipleWindow();
	}

}
