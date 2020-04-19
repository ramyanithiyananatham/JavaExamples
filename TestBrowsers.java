package testcases;
import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.ie.InternetExplorerDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.ie.InternetExplorerDriver;
//import org.openqa.selenium.opera.OperaDriver;
//import org.openqa.selenium.opera.OperaOptions;
//import org.openqa.selenium.remote.DesiredCapabilities;


public class TestBrowsers {
public static void main(String[] args) throws InterruptedException {
	//System.setProperty("webdriver.gecko.driver","C:\\Tools\\geckodriver.exe");
	//FirefoxDriver driver= new FirefoxDriver();
	
	//System.setProperty("webdriver.chrome.driver","C:\\Tools\\chromedriver.exe");
	//ChromeDriver driver= new ChromeDriver();
	//Thread.sleep(5000);
	
	//System.setProperty("webdriver.ie.driver","C:\\Tools\\IEDriverServer.exe");
	//DesiredCapability.setCapability("")-->  for ignoring protected mode security or zoom
	//InternetExplorerDriver driver= new InternetExplorerDriver();
	
	System.setProperty("webdriver.edge.driver","C:\\Tools\\MicrosoftWebDriver.exe");
	//it is uncompressed folder. and has some connection exception
	EdgeDriver driver= new EdgeDriver();
	
	/*System.setProperty("webdriver.opera.driver","C:\\Tools\\operadriver_win64\\operadriver.exe");
	DesiredCapabilities capabilities= new DesiredCapabilities();
	OperaOptions options= new OperaOptions();
	options.setBinary("C:\\Users\\User\\AppData\\Local\\Programs\\Opera\\64.0.3417.92\\Opera.exe");
	capabilities.setCapability(OperaOptions.CAPABILITY, options);
	
	OperaDriver driver= new OperaDriver(options);
	driver.get("http://way2automation.com");*/
	
	driver.close();
}
}
