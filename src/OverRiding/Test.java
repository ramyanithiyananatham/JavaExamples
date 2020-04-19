package OverRiding;

import java.util.Scanner;

//to use same code(instead of creating code to call specific method) execute parallely for all browsers, we need overriding 
//or using same code, while selecting driver at run time or runtime polymorphysm, or latebinding
public class Test extends BrowserSelect {
	public static void main(String[] args) {
		Test t=new Test();
		t.initBrowser();
		
	      
}
	public void initBrowser() {
		Scanner in = new Scanner(System.in);   
	      System.out.println("type Firefox/Chrome/InternetExplorer");  
	      String browserName = in.nextLine(); 
	      in.close();
	      
  WebDriver driver= getBrowserInstance(browserName);
	//FireFocDriver driver = new FireFocDriver();
  //ChromeDriver driver = new ChromeDriver();
	//InternetExplorerDriver driver = new InternetExplorerDriver();
driver.click();
driver.sendKeys();
driver.getTitle();
    }
}
