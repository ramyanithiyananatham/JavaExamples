package tutorial;

import java.util.Scanner;

public class Factorial {
	

	    public static void main(String[] args) {
	        int num;
	        Scanner fact=new Scanner(System.in);  // Create a Scanner object
	        System.out.println("Factorial for number");

	        num = fact.nextInt();  // Read user input
	        fact.close();
	        System.out.println("Factorial for number " +num);  
	        long factorial = multiplyNumbers(num);
	        System.out.println("Factorial of " + num + " = " + factorial);
	    }
	    public static long multiplyNumbers(int num)
	    {
	        if (num >= 1)
	            return num * multiplyNumbers(num - 1);
	        else
	            return 1;
	    }
	
}
