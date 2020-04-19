package inheritance;
// calculator, MulCalculation single level inheritence
public class MulCalculation extends Calculator {
	public void multiplication(int x, int y) {
	      z = x * y;
	      System.out.println("The product of the given numbers:"+z);
	   }
		
	   public static void main(String args[]) {
	      int a = 20, b = 10;
	      MulCalculation demo = new MulCalculation();
	      demo.addition(a, b);
	      demo.Subtraction(a, b);
	      demo.multiplication(a, b);
	   }

}
