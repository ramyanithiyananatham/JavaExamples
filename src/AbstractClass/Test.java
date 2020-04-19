package AbstractClass;

public class Test extends FirefoxDriver {
	public static void main(String[] args) {
		Test t = new Test();
		t.getTitle();// concrete method of abstract class can be called using object of its(abstract classes child) child class
		t.captureScreenshot();//method in child class 
		WebDriver t1= new Test();
		t1.getTitle();
		//t1.captureScreenshot();// since captureScreenshot() is method in FirefoxDriver(child of WebDriver) class. Polymorphic referance
	}

}
