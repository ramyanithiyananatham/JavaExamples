package tutorial;

import java.util.Scanner;

public class tribinoci {
	static int n1=0,n2=1,n3=2,n4=0;    
	 static void printtribbonacci(int count){    
	    if(count>0){    
	         n4 = n1 + n2+n3;    
	         n1 = n2;    
	         n2 = n3; 
	         n3=n4;
	         System.out.print(" "+n4);   
	         printtribbonacci(count-1);    
	     }    
	 }    
	 public static void main(String args[]){    
	  Scanner in = new Scanner(System.in);   
      System.out.println("Enter the count for tribbinoci series");  
      int count = in.nextInt();
      in.close();
	  System.out.print(n1+" "+n2+" "+n3);//printing 0 and 1 and 2    
	  printtribbonacci(count-3);//n-2 because 2 numbers are already printed   
	 }  
}
