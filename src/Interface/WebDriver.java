package Interface;
//public final interface WebDriver
public interface WebDriver //Interface and abstract can't be final
{
	public abstract void click();//an abstract method can be only in Abstract class or interface

	public void sendKeys();
public void getTitle();//we cant specify body to any method in interface
}
