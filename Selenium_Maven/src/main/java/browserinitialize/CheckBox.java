package browserinitialize;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CheckBox extends Base {
	
	public void clickCheckBox() {
		driver.navigate().to("https://selenium.qabible.in/check-box-demo.php");
		WebElement clickOnCheckBox=driver.findElement(By.id("gridCheck"));
		System.out.println(clickOnCheckBox.isSelected());
		clickOnCheckBox.click();
		System.out.println(clickOnCheckBox.isSelected()); //To verify whether the check box is selected
	}
	
	public void radioButton() {
		driver.navigate().to("https://selenium.qabible.in/radio-button-demo.php");
		WebElement clickradioButton=driver.findElement(By.xpath("(//input[@value='Female'])[1]"));
		clickradioButton.click();
		WebElement showSelectedValueButton=driver.findElement(By.xpath("//button[text()='Show Selected Value']"));
		showSelectedValueButton.click();
		System.out.println(showSelectedValueButton.isDisplayed()); //To verify whether an element is displayed
		//WebElement selectedValueMessage1=driver.findElement(By.xpath("//div[text()=\"Radio button 'Female' is checked\"]"));
		//System.out.println(selectedValueMessage1.isDisplayed());
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckBox checkBoxObj=new CheckBox();
		checkBoxObj.browserinitialization();
		//checkBoxObj.clickCheckBox();
		checkBoxObj.radioButton();
	}

}
