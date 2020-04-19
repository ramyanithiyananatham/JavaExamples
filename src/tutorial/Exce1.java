package tutorial;

public class Exce1 {

		  public static void main(String[] args) {
		    try {
		      int[] myNumbers = {1, 2, 3};
		      System.out.println(myNumbers[20]);
		    } catch (Exception e) {
		      System.out.println("Something went wrong.");
		      System.out.println(e.getMessage());
		     e.printStackTrace();
		     }

		    finally// should follows try/catch block
		    {
		     System.out.println("The 'try catch' is finished.");
		    }

		    System.out.println("end of try exception handling");
		  }
		
		 
}
