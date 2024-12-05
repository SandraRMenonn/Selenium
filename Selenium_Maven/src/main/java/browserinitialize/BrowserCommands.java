package browserinitialize;

public class BrowserCommands extends Base {

	public void browserCommands() {
		String title=driver.getTitle(); //to get the page title
		System.out.println(title);
		String url=driver.getCurrentUrl();//to get the page URL 
		System.out.println(url);
		String pageSource=driver.getPageSource(); //to get the page source code
		System.out.println(pageSource);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BrowserCommands browsecmd=new BrowserCommands();
		browsecmd.browserinitialization();
		browsecmd.browserCommands();
		browsecmd.browserQuit();
	}

}
