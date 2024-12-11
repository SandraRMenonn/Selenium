package browserinitialize;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ClickAction extends Base {
	
	public void simpleFormDemo() {
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
	WebElement inputMessage = driver.findElement(By.id("single-input-field"));
	inputMessage.sendKeys("Demo Message"); //to input text in a WebElement
	WebElement showMessage=driver.findElement(By.id("button-one"));
	showMessage.click(); //To click a webElement
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClickAction clickAction=new ClickAction();
		clickAction.browserinitialization();
		clickAction.simpleFormDemo();
		
	}

}
