package polymorphism;
//In same class, multiple methods with Same method name and different signature is called overloading
//same method signature but different return type is not over loading( while calling method we wont refer return type, so ambiguity results)
//even main method can be overloaded
public class Overloading {
	public int pNo= 12345678;
	private String passWord= "123";
	private String uName="ABC";
	
	public void doLogin(int phoneNumber, String password)

	{
		if (phoneNumber == pNo && password == passWord) 
		{
			System.out.println("valid credentials");
		}
		else
			System.out.println("Invalid credentials");

	}
	public void doLogin(int phoneNumber,String userName, String password)

	{
		if ((phoneNumber == pNo && userName==uName) && password == passWord) 
		{
			System.out.println("valid credentials");
		}
		else
			System.out.println("Invalid credentials");

	}

	public void doLogin(String userName, String password)

	{
		if (userName == uName && password == passWord) 
		{
			System.out.println("valid credentials");
		}
		else
			System.out.println("Invalid credentials");

	}
	public static void main(String[] args) {
		Overloading obj= new Overloading();
		obj.doLogin(12345678, "123");
		
	}
	public static void main(String args)//different signature
	{
		
	}
	
}
