package testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class InputForm extends Base {

  @Test
  public void inputForm() {
	  driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		
		WebElement inputmessage = driver.findElement(By.id("single-input-field"));
		inputmessage.sendKeys("Hello Java");
		WebElement showmsg = driver.findElement(By.id("button-one"));
		showmsg.click();
  }
}
