package polymorphism;

public class Overloading1 {
	 void sum(int a, double b) {
	       double sum = a + b;
	        System.out.println("sum of no is " + sum);
	 	    }
	 
	    void sum(double a, double b) {
	        double sum = a + b;
	        System.out.println("sum of no is " + sum);
	    }
	    /*// the following code if executed make compiler ambiguous 
	     * void sum(double b, int c) {
		       double sum = b+c;
		        System.out.println("sum of no is " + sum);
		 	    }
	 */
	    public static void main(String args[]) {
	        Overloading1 obj = new Overloading1();
	        obj.sum(5, 10);
	        obj.sum(5.0, 2.0);
	 
	    }

}
