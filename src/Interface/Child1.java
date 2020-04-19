package Interface;

public class Child1 extends ParentClass1 implements Parent1, Parent2 {

	/*@Override
	public void show() { // TODO Auto-generated method stub
	 System.out.println("Child Show"); }
	 */
	public static void main(String[] args) {
		// all the below c calls method in child1 class
		//Child1 c= new Child1();
		//Parent1 c= new Child1();
		Parent2 c= new Child1();
		
		c.show();
	
	}
	

}
