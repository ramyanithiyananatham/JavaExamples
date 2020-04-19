package inheritance;
// we can extend  MulCalculation or DivCalculation, suince java dont support Multiple inheritence
public class MultilevelInheritance extends  DivCalculation{
	public void mod(int x, int y) {
	      z = x %y;
	      System.out.println("The mod of the given numbers:"+z);
	   }
		
	   public static void main(String args[]) {
	      int a = 20, b = 10;
	      MultilevelInheritance demo = new MultilevelInheritance();
	      demo.addition(a, b);
	      demo.Subtraction(a, b);
	      demo.division(a, b);
	      demo.mod(a, b);
	   }

}
