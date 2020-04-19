package tutorial;

public class MethodCalling {
	public static void main(String[] args) {
		MethodCalling m = new MethodCalling();
		Home h = new Home();
		h.i++;
		Home h1 = new Home();
		h1.i++;
		Home h2 = new Home();
		System.out.println(h2.i);
		m.go();
		go3();// both main and go3 are static methods

	}

	public void go() {
		System.out.println("Inside Go");
		go1();
	}

	public void go1() {
		System.out.println("Inside Go1");
		go2();
	}

	public void go2() {
		System.out.println("Inside Go2");
//System.out.println();
	}

	public static void go3() {
		System.out.println("Inside Go3");

	}

}
