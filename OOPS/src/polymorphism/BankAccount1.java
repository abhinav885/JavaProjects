package polymorphism;
class Account{
	void calculateInterest() {
		System.out.println("Calculating Account Interest");
	}
}

class savingsAccount extends Account{
	void calculateInterest() {
		System.out.println("Calculating Savings Account");
	}
}

class currentAccount extends Account{
	void calculateInterest() {
		System.out.println("Calculating current Account");
	}
}

class fixedDepositAccount extends Account{
	void calculateInterest() {
		System.out.println("Calculating deposited amount");
	}
}

public class BankAccount1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account a;
		a = new savingsAccount();
		a.calculateInterest();
		
		a = new currentAccount();
		a.calculateInterest();
		
		a = new fixedDepositAccount();
		a.calculateInterest();

	}

}
