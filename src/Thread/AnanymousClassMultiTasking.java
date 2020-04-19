package Thread;
// Thread using Interface or anonymos class

public class AnanymousClassMultiTasking {

	public static void main(String args[]) {

		Runnable r1 = new Runnable() {
			public void run() {
				System.out.println("task one");
			}
		};
		// AnanymousClassMultiTasking r1=new AnanymousClassMultiTasking();
		Thread t1 = new Thread(r1);

		Thread t2 = new Thread() {
			public void run() {
				System.out.println("task two");
			}
		};

		t1.start();
		t2.start();

	}
}
