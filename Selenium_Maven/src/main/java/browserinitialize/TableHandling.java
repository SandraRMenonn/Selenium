package browserinitialize;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TableHandling extends Base {
	
	

	public void fullTable() {  //to get all data from a table which is same as data of all rows
		
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement table=driver.findElement(By.xpath("//table[@id='dtBasicExample']"));
		System.out.println(table.getText());
		
	}
	
	/*tbody = Table Body
	 tr = Table Row
	 td = Table data
	 */
	
	//Sometimes heading row/column will be under tr tag, in that case row 1 will be the heading row. Here, heading row is under th(table heading) tag, thus tr(table row) doesn't count heading row.
	
	public void dataFromRow() { //To get a data from a row of a table
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement dataRow=driver.findElement(By.xpath("//table[@id='dtBasicExample']/tbody/tr[4]")); //4th Row in the table body
		System.out.println(dataRow.getText());
	}
	
	public void dataFromCell() { //to get data from a cell of a row
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement dataCell=driver.findElement(By.xpath("//table[@id='dtBasicExample']/tbody/tr[4]/td[2]")); //2nd data in the 4th row in the table body
		System.out.println(dataCell.getText());
		
	}
	
	public void dataFromColumn() { //To get data from a column
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		List<WebElement> dataColumn=driver.findElements(By.xpath("//table[@id='dtBasicExample']/tbody/tr/td[3]")); //3rd data in the column 
		
		for(WebElement data:dataColumn) { //Iterating to get all data from the column
			System.out.println(data.getText());
		}
	}
	
	public void inputValueinTable() { //To verify the data in the table with the data we input/provide
		String input="Tokyo";
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		List<WebElement> inputValue=driver.findElements(By.xpath("//table[@id='dtBasicExample']/tbody/tr/td[3]"));
		
		for(WebElement tableInput:inputValue) {
			if(tableInput.getText().equals(input)) { //comparing
				System.out.println(tableInput.getText());
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TableHandling table=new TableHandling();
		table.browserinitialization();
		table.fullTable();
		System.out.println("****************************************");
		System.out.println("****************************************");
		table.dataFromRow();
		System.out.println("****************************************");
		System.out.println("****************************************");
		table.dataFromCell();
		System.out.println("****************************************");
		System.out.println("****************************************");
		table.dataFromColumn();
		System.out.println("****************************************");
		System.out.println("****************************************");
		table.inputValueinTable();
	}

}
