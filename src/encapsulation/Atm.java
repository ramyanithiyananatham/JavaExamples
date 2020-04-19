package encapsulation;

public class Atm {
	public static void main(String[] args) {
		Bank obj=new Bank();
		//obj.pinNo=111;to avoid this security breech accNo, pinNo, balance should be private
		
		obj.withdrawAmount(123456,123, 2000);
		obj.updatePin(123456, 123, 456);
		//double remainingAmount=
				obj.depositCash(123456, 456, 4000);
		System.out.println();
	}

}
