package tutorial;

import java.io.FileNotFoundException;

public class CheckedExceTry {
	//if we throw a checked/compile time exception using throw statement, we MUST either handle the exception in catch block or method much explicitly declare it using throws declaration. Oe InterruptedException for thread
	 public static void main(String[] args) 
	    {
	        try
	        {
	            method();
	        } 
	        catch (FileNotFoundException e) 
	        {
	            e.printStackTrace();
	        }
	    }
	     
	    public static void method( ) throws FileNotFoundException 
	    {
	        throw new FileNotFoundException();
	    }

}
