package inheritance;

public class DivCalculation extends Calculator
{// calculator, MulCalculation, DivCalculation hierarchial level inheritence
	public void division(int x, int y) {
	      z = x /y;
	      System.out.println("The division of the given numbers:"+z);
	   }
		
	   public static void main(String args[]) {
	      int a = 20, b = 10;
	      DivCalculation demo = new DivCalculation();
	      demo.addition(a, b);
	      demo.Subtraction(a, b);
	      demo.division(a, b);
	   }
}
