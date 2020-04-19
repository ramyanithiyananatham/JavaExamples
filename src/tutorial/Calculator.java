package tutorial;

public class Calculator {
	int i = 20, j = 10, k = 0;

	public static void main(String args[]) {
		Calculator calc = new Calculator();
		System.out.println("add" + calc.add(calc.i, calc.j));// arguments

		calc.k = calc.sub(calc.i, calc.j);
		System.out.println("sub" + calc.k);
		System.out.println("mul" + calc.mul(calc.i, calc.j));
		System.out.println("div" + calc.div(calc.i, calc.j));
		double num = Math.random();
		int n = (int) (num * 10);

		if (n <= 2)
			System.out.println(n + " n<=2");
		else if (n > 2 && n <= 5)
			System.out.println(n + " n is between 2 &5");
		else
			System.out.println(n + " n>5");

	}

	public int add(int x, int y)// parameters
	{
		int z = x + y;
		return z;
	}

	public int sub(int x, int y) {
		int z = x - y;
		return z;
	}

	public int mul(int x, int y) {

		return x * y;
	}

	public int div(int x, int y) {
		int z = x / y;
		return z;
	}

}
