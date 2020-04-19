package polymorphism;



public class RBI {
public Double getHomeLoan()
{
	return 8.5;
}
public Double getCarLoan()
{
	return 10.5;
}
public RBI getObject()
{
RBI obj1= new RBI();
return obj1;
}
/*public Number show()
{
	return 12;
	}*/
public Integer show()// 10 is child of Integer (or) WebDrivwr Driver= new FirefoxDriver, but reverse is not possible
{
	return 10;
}
}
