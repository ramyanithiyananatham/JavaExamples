package tutorial;
import java.util.*;
public class UncheckedExce
{// throwing an unchecked/Runtime exception from a method, it is not mandatory to handle the exception or declare in throws clause. 
			  static void checkAge(int age) {
		    if (age < 18) {
		      throw new ArithmeticException("Access denied - You must be at least 18 years old.");
		    }
		    else {
		      System.out.println("Access granted - You are old enough!");
		    }
		  }

		  public static void main(String[] args) {
			  Scanner input = new Scanner (System.in);
		        System.out.print("What is your age: ");
		        int age = input.nextInt();
		        input.close(); //ignore • 
		    checkAge(age); // Set age to 15 (which is below 18...)
		  }
		}

