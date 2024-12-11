package browserinitialize;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FindElementsDemo extends Base {
	
	public void findMultipleElements() {
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		List <WebElement> findMultipleElement=driver.findElements(By.xpath("//input[@type='text']")); //using List To perform same action in multiple elements of same type
		
		for(WebElement textInput:findMultipleElement) { //It iterates over each element in the list and perform the below action
			textInput.sendKeys("Demo");

			}
		
		driver.navigate().to("https://selenium.qabible.in/check-box-demo.php");
		List <WebElement> findMultipleElement1=driver.findElements(By.xpath("//input[@type='checkbox']"));
		
		for(WebElement checkBox:findMultipleElement1) {
			checkBox.click();

			}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindElementsDemo findElementsDemo=new FindElementsDemo();
		findElementsDemo.browserinitialization();
		findElementsDemo.findMultipleElements();
	}

}
