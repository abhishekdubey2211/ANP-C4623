package corejava;

public class BankAccount 
{
	//fields
	private double balance;
	private String accountNumber;
	double amount;

	
	//creating parameterized constructor for BankAccount
	public BankAccount(double balance, String accountNumber) 
	{
//		super();
		this.balance = balance;
		this.accountNumber = accountNumber;
	}


//	creating getter and setter
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountnumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	
	
	//creating method deposit
	public void deposit(double amount) 
	{
		System.out.print("Balance After Depositing in Account : ");
		System.out.println(amount =amount +balance);
	}
	
	
	//creating method withdraw
	public void wihdraw(double amount) 
	{
		System.out.print("Balance After Withdrawing from Account : " );
		System.out.println(amount = balance - amount);
	}
	
}

