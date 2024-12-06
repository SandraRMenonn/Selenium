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
		WebElement nameLocate=driver.findElement(By.name("description"));
	}
	
	public void linkTextLocator() {
		WebElement linkText=driver.findElement(By.linkText("simple-form-demo.php")); //By URL
		WebElement linkText1=driver.findElement(By.linkText("select-input.php"));
		WebElement linkText2=driver.findElement(By.linkText("jquery-select.php"));
	}
	
	public void partialLinkTestLocator() {
		WebElement partialLinkText=driver.findElement(By.partialLinkText("simple-form")); //By giving Partial URL also it gets located
		WebElement partialLintText1=driver.findElement(By.partialLinkText("button-demo"));
		WebElement partialLintText2=driver.findElement(By.linkText("jquery-select"));
		
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
		
		
		WebElement css4=driver.findElement(By.cssSelector("input#value-b"));
		//WebElement css5=driver.findElement(By.cssSelector("span.navbar-toggler-icon"));
		WebElement css6=driver.findElement(By.cssSelector("input[id=single-input-field]"));
		WebElement css7=driver.findElement(By.cssSelector("input.form-control[id=value-b]"));
	}
	
	public void absoluteXpath() {
		WebElement abXpath=driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[1]/div/div[2]/form/div[1]/input"));
	}
	
	public void relativeXpath() {
		//relative xpath= //tagname[@attributetype='attributevalue']
		WebElement relativeXpath=driver.findElement(By.xpath("//input[@id='value-a']"));
		WebElement relativeXpath1=driver.findElement(By.xpath("//a[@href='check-box-demo.php']"));
		
	}
	
	public void dynamicXpath() {
		// contains() = //tagname[contains(@attributetype,'value')]
		WebElement dynXpath=driver.findElement(By.xpath("//a[contains(@href,'check-box-demo.php')]"));
		WebElement dynXpath1=driver.findElement(By.xpath("//input[contains(@id,'value-a')]"));
		
		//text() = //tagname[text()='value']
		WebElement dynXpath3=driver.findElement(By.xpath("//a[text()='Jquery Select2']"));
		
	}
	
	public void childXpath() {
		WebElement childTag=driver.findElement(By.xpath("//a[@class='navbar-brand']//child::img[@src='images/logo.png']"));
	}
	
	public void parentXpath() {
		WebElement parentTag=driver.findElement(By.xpath("//img[@src='images/logo.png']//parent::a[@class='navbar-brand']"));
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
