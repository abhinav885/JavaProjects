package polymorphism;
class Account5{
	void interest() {
		System.out.println("Interest is calculated");
	}
}

class SavingsAccount3 extends Account5{
	void interest() {
		System.out.println("SavingsAccount Interest:6%");
	}
	void deposit() {
		System.out.println("Amount has been deposited successfully");
	}
}

class CurrentAccount3 extends Account5{
	void interest() {
		System.out.println("CurrentAccount Interest: 10%");
	}
	void withdraw() {
		System.out.println("Amount has been withdrawn successfully");
	}
}

class Bank{
	static void permit(Account5 ref) {
		ref.interest();//upcasting
	}
	static void savings(Account5 ref) {
		SavingsAccount3 s = (SavingsAccount3)ref;//downcasting
		s.deposit();
	}
	static void Current(Account5 ref) {
		CurrentAccount3 c = (CurrentAccount3)ref;
		c.withdraw();
	}
}
public class BankAccount5 {

		public static void main(String[] args) {
		// TODO Auto-generated method stub
				// TODO Auto-generated method stub
				SavingsAccount3 s = new SavingsAccount3();
				CurrentAccount3 c = new CurrentAccount3();
				Bank.permit(s);
				Bank.permit(c);
				Bank.savings(s);
				Bank.Current(c);
			}
}

