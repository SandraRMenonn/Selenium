package browserinitialize;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.awt.Toolkit;
import java.awt.Robot;
import java.awt.AWTException;


public class FileUpload {
	
	public WebDriver driver;
	
	//First method to upload files
	public void fileUploadDemo() {
		driver=new ChromeDriver();
		//driver.navigate().to("https://www.ilovepdf.com/pdf_to_word");
		
		driver.navigate().to("https://the-internet.herokuapp.com/upload");
		driver.manage().window().maximize();
		WebElement chooseFile=driver.findElement(By.xpath("//input[@id='file-upload']"));
		//chooseFile.click();
		chooseFile.sendKeys("C:\\Users\\sandr\\Downloads\\notes (1).pdf");
		WebElement uploadButton=driver.findElement(By.xpath("//input[@id='file-submit']"));
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));//Explicit wait added
		wait.until(ExpectedConditions.elementToBeClickable(uploadButton));
		uploadButton.click();
		driver.quit();
	}
	
	//Second method to upload files
	public void fileUploadRobotClass() throws AWTException {
		/*driver.navigate().to("https://the-internet.herokuapp.com/upload");
		 driver.manage().window().maximize();
		WebElement chooseFile=driver.findElement(By.xpath("//input[@id='file-upload']"));
		//chooseFile.click(); */
		
		driver=new ChromeDriver();
		driver.navigate().to("https://www.ilovepdf.com/pdf_to_word");
		driver.manage().window().maximize();
		WebElement chooseFile=driver.findElement(By.xpath("//a[@id='pickfiles']"));
		chooseFile.click();
		
		StringSelection choose=new StringSelection("C:\\Users\\sandr\\Downloads\\notes (1).pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(choose,null);
		Robot robot=new Robot();
		robot.delay(2500);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		driver.quit(); 
	}
	


	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		
		FileUpload fileUpload=new FileUpload();
		//fileUpload.fileUploadDemo();
		fileUpload.fileUploadRobotClass();
		
		
	}

}
