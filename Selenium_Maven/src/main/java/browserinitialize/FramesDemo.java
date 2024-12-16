package browserinitialize;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FramesDemo extends Base {
	
	
	public void framesDemo() {
		driver.navigate().to("https://demo.guru99.com/test/guru99home/");
		
		WebElement iframe=driver.findElement(By.xpath("//iframe[@id='a077aa5e']")); //For finding any element inside an iFrame, first iframe should be identified
		driver.switchTo().frame(iframe); //Then should switch to iframe
		WebElement frame1=driver.findElement(By.xpath("//img[@src='Jmeter720.png']")); //then we will be able to find the element inside the iframe
		frame1.click();	
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FramesDemo framesObj=new FramesDemo();
		framesObj.browserinitialization();
		framesObj.framesDemo();
	}

}
