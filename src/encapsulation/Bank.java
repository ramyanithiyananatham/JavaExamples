package encapsulation;

public class Bank {
	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public int getAccNo() {
		return accNo;
	}

	public void setPinNo(int pinNo) {
		this.pinNo = pinNo;
	}

	public int accNo = 123456;
	private int pinNo = 123;
	private double balance = 10000;

	public void withdrawAmount(int ano, int pno, int amount) {
		if (ano == accNo && pno == pinNo) {
			System.out.println("valid credentials");
			if (amount < balance) {
				balance = balance - amount;
				System.out.println("Balance after transaction is:" + balance);
			}

			else {
				System.out.println("Insufficient Balance");
			}

		} // if
		else {
			System.out.println("Invalid credentials");
		}
	}

	public void updatePin(int ano, int oldPno, int newPno) {
		if (ano == accNo && oldPno == pinNo) {
			pinNo = newPno;
			System.out.println("Pin number is sucessfully changed");
		}
		else
		System.out.println("Invalid credentials");
	}

public double depositCash(int ano, int pno, double amount)
{
	if (ano == accNo && pno == pinNo)
	{
	System.out.println("Your amount is deposited");
	balance=balance+amount;
	}
	else
	{
		System.out.println("invalid credentials");
	}
		return balance;
}

}
