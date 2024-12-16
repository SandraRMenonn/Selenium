package browserinitialize;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AlertHandling extends Base {
	
	public void alertHandling() {
		driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
	/*	WebElement clickMe=driver.findElement(By.xpath("(//button[text()='Click me!'])[1]"));
		clickMe.click();
		driver.switchTo().alert().accept(); //Alerts cannot be located or found. methods to switch to ALert and accept it.
		
		WebElement clickMe2=driver.findElement(By.xpath("(//button[text()='Click me!'])[2]"));
		clickMe2.click();
		driver.switchTo().alert().dismiss(); //methods to switch to ALert and dismiss it.
		
		*/
		
		WebElement promptAlert=driver.findElement(By.xpath("//button[text()='Click for Prompt Box']"));
		promptAlert.click();
		driver.switchTo().alert().sendKeys("Sandra");//methods to switch to ALert and enter input
		driver.switchTo().alert().accept();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AlertHandling alert=new AlertHandling();
		alert.browserinitialization();
		alert.alertHandling();
	}

}
