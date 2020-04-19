package polymorphism;
//we cant change return type(primitive data) while performing over riding.but classname(covariant) return types can be changed
public class HSBC extends RBI {
	public static void main(String[] args) {
	//HSBC obj=new HSBC();
   RBI obj=new HSBC();//  HSBC is child of RBI. i.e, parent class object can be used as child class reference
   //feasable due to polymorphism,and inheritance. This is called covariant.
		System.out.println(obj.getHomeLoan());
	}
	public Double getHomeLoan()
	{
		return 12.5;
	}
	public Amex getObject()// if Amex extends RBI 
	{
	Amex obj1= new Amex();
	return obj1;
	}
	
}
