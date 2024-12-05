package browserinitialize;

public class NavigationCommands extends Base{

	public void navigationCommands() {
		driver.navigate().to("https://www.amazon.in/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NavigationCommands navigate=new NavigationCommands();
		navigate.browserinitialization();
		navigate.navigationCommands();
	
		

	}

}
