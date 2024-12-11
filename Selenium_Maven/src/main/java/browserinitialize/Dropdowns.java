package browserinitialize;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Dropdowns extends Base {
	
	public void selectDropdownValue() {
		driver.navigate().to("https://selenium.qabible.in/select-input.php");
		WebElement dropDownElement=driver.findElement(By.cssSelector("select.form-control[id=single-input-field]"));
		Select selectDropDown=new Select(dropDownElement); //methods in Select class is used to select DD values 
		selectDropDown.selectByVisibleText("Yellow"); //select dropdown by Visible Text.
		selectDropDown.selectByIndex(1); //select using the index position of that DD value. include default value too. eg. 'Select' here.
		selectDropDown.selectByValue("Green"); //select using the value in Value attribute
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dropdowns dropDownValue=new Dropdowns();
		dropDownValue.browserinitialization();
		dropDownValue.selectDropdownValue();
		
	}

}
