package OverRiding;

public class ChromeDriver extends WebDriver{
	public void click()
	{
		System.out.println("clicking chrome");
	}
	public void sendKeys()
	{
	System.out.println("enter key in chrome");	
	}
	public void getTitle()
	{
	System.out.println(" getting title from chrome");	
	}
}
