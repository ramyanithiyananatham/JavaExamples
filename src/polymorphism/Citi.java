package polymorphism;

public class Citi extends RBI {
	
	
	public static void main(String[] args) {
		//Citi obj=new Citi();
		 Citi obj=new Citi();// feasable due to polymorphism, Citi is child of RBI
		System.out.println(obj.getHomeLoan());
	}
	public Double getHomeLoan()
	{
		return 18.5;
	}
}
