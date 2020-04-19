package polymorphism;
class First
{
    protected void display() 
                   {
    System.out.println("    Class one ");
    }
    void sign()
    {
 System.out.println("Thank you\n~ramya");
    }
}
 class Second  extends First
{
   public void display()// access modifier of method in subclass cant be more restrictive than parent acess
    {
 //super.display();//calls parent class member
     System.out.println("    Class Two ");
    }
}
class Third extends Second 
{
    void display1()
    {
       
  System.out.println("    Class Three\n");
        sign();
    }
}
class Four extends Third
{
	 public void display()
	    {
		 super.display();// refer method in immediate parent and not root parent
		 
	     System.out.println("    Class Four ");
	    }
	 void new1()
	    {
	 //super.display();//calls parent class member
	     System.out.println("    Class Two ");
	    }
}
public class TestSuper
{
   public static void main(String[] args)
   {
   System.out.println("multi-level inheritance using\nSUPER keyword \n");
    Third  obj = new Four();
        obj.display();   
       // obj.new1(); Dynamic method dispatch obj cant call methods which are newly created in child class
    }
}

