package browserinitialize;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Locators extends Base{
	
	//Locators are used to locate an element/object in a WebPage. We cannot perform any action with an element unless the element is located
	public void idLocator() {
		
		//WebElement refVariablename=InstanceOfWebDriver.AMethodInWebDriverToLocateElement(LocatorType("Value"))
		//WebElement is an interface in Selenium.It represents an HTML element on a web page and provide methods to interact with these elements, such as clicking, typing etc.
		WebElement inputForm=driver.findElement(By.id("single-input-field"));
		WebElement inputForm1=driver.findElement(By.id("button-one"));
		WebElement inputForm2=driver.findElement(By.id("value-a"));
	}
	
	public void classLocator() {
		WebElement classLocate=driver.findElement(By.className("navbar-toggler-icon"));
		
	}
	
	public void nameLocator() {
		WebElement nameLocate=driver.findElement(By.name(""));
	}
	
	public void linkTextLocator() {
		WebElement linkText=driver.findElement(By.linkText("simple-form-demo.php")); //By URL
	}
	
	public void partialLinkTestLocator() {
		WebElement partialLinkText=driver.findElement(By.partialLinkText("simple-form")); //By giving Partial URL also it gets located
	}
	
	public void cssSelectorLocator() {
		    /*
		    tag and id - tagname#idValue
			tag and class - tagname.classvalue
			tag and attribute - tagname[attributetype=attributevale]
			tag,class and attribute - tagname.class[attributetype=value]
			*/
		
		WebElement css=driver.findElement(By.cssSelector("input#single-input-field"));
		WebElement css1=driver.findElement(By.cssSelector("span.navbar-toggler-icon"));
		WebElement css2=driver.findElement(By.cssSelector("input[id=single-input-field]"));
		WebElement css3=driver.findElement(By.cssSelector("input.form-control[id=value-a]"));
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
