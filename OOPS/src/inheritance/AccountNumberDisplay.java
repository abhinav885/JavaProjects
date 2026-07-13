package inheritance;
class Account3{
	private String accountNumber;
	private long balance;

	public Account3(String accountNumber, long balance) {
		super();
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	public void setBalance(long balance) {
		this.balance = balance;
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}
	
	public long getBalance() {
		return balance;
	}
	
	void getDetails() {
		System.out.println("Account Details");
		System.out.println("Account Number: "+getAccountNumber());
		System.out.println("Balance: "+getBalance());
	}
}

class SavingsAccount extends Account3{
	private float interestRate;

	public SavingsAccount(String accountNumber, long balance, float interestRate) {
		super(accountNumber, balance);
		this.interestRate = interestRate;
	}

	public float getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(float interestRate) {
		this.interestRate = interestRate;
	}
	
	void getDetails() {
		super.getDetails();
		System.out.println("Interest Rate: "+getInterestRate());
	}
}

class CurrentAccount extends Account3{
	private long overDraftLimit;

	public CurrentAccount(String accountNumber, long balance, long overDraftLimit) {
		super(accountNumber, balance);
		this.overDraftLimit = overDraftLimit;
	}

	public long getOverDraftLimit() {
		return overDraftLimit;
	}

	public void setOverDraftLimit(long overDraftLimit) {
		this.overDraftLimit = overDraftLimit;
	}
	
	void getDetails() {
		System.out.println();
		super.getDetails();
		System.out.println("OverDraftLimit: "+getOverDraftLimit());
	}
}
public class AccountNumberDisplay 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		SavingsAccount s = new SavingsAccount("88822",28000,12.5f);
		CurrentAccount c = new CurrentAccount("9532213",125000,52);
		s.getDetails();
		c.getDetails();

	}

}
