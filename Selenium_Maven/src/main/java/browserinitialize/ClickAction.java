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
	
	public void inputValues() {
		WebElement valueA=driver.findElement(By.id("value-a"));
		System.out.println(valueA.isEnabled());
		valueA.sendKeys("100");
		WebElement valueB=driver.findElement(By.id("value-b"));
		System.out.println(valueB.isEnabled());
		valueB.sendKeys("20");
		WebElement getTotal=driver.findElement(By.id("button-two"));
		getTotal.click();
		WebElement totalMessage=driver.findElement(By.xpath("//div[text()='Total A + B : 120']"));
		System.out.println("Total is displayed in Message : " + (totalMessage.isDisplayed()));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClickAction clickAction=new ClickAction();
		clickAction.browserinitialization();
		clickAction.simpleFormDemo();
		clickAction.inputValues();
		clickAction.browserQuit();
	}

}
