package OverRiding;

public class InternetExplorerDriver extends WebDriver {
	public void click()
	{
		System.out.println("clickingIE");
	}
	public void sendKeys()
	{
	System.out.println("enter key in IE");	
	}
	public void getTitle()
	{
	System.out.println(" getting title from IE");	
	}
}
