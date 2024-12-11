package browserinitialize;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop extends Base {
	
	public void dragandDrop(){
		driver.navigate().to("https://selenium.qabible.in/drag-drop.php");
		WebElement dragValue=driver.findElement(By.xpath("//span[text()='Draggable n°2']"));
		Actions actions=new Actions(driver); //obj for Action class. It has methods to do perform mouse actions
		actions.moveToElement(dragValue).click();
		actions.doubleClick(dragValue).perform(); //To doubleclick an element. Not necessary here.
		actions.contextClick(dragValue).perform(); //To rightClick an element. Not necessary here.
		WebElement dropBox=driver.findElement(By.xpath("//div[@id='mydropzone']"));
		actions.dragAndDrop(dragValue, dropBox).build().perform();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DragandDrop drag=new DragandDrop();
		drag.browserinitialization();
		drag.dragandDrop();
		
	}

}
