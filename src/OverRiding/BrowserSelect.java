package OverRiding;

public class BrowserSelect {
public WebDriver getBrowserInstance(String browserName)
{
	if(browserName.equalsIgnoreCase("Firefox"))
			{
		 return new FireFocDriver();
		
			}
	else if(browserName.equalsIgnoreCase("Chrome"))
			{
		return new ChromeDriver();
			}
	else if(browserName.equalsIgnoreCase("InternetExplorer"))
			{
		return new InternetExplorerDriver();
			}
	else 
		return null;
}
}
