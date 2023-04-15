package OOPS;
import java.util.*;


class AccountDetail{
	private double balance;
	private double deposit;
	private double withdraw;
	
	public AccountDetail(double balance, double deposit, double withdraw) {
		super();
		this.balance = balance;
		this.deposit = deposit;
		this.withdraw = withdraw;
	}
	
	public void balanceAfterDeposit() {
		System.out.println("Initial balance in your account is "+balance+"/-");
		System.out.println("After depositing "+ deposit +"/-  your current balance will be "+ (balance+deposit)+"/-");
	}
	
	public void balanceAfterWithdraw() 
	{
		System.out.println("After withdrawing "+ withdraw +"/-  your current balance will be "+ ((balance+deposit)-withdraw)+"/-");
		System.out.println("Current balance = "+ ((balance+deposit)-withdraw)+"/-" ); 
	}
	
	public void conclude()
	{
	if (((balance+deposit)-withdraw)>balance) {
		System.out.println("You can withdraw Money");
	}else {
		System.out.println("You Insufficient ammount to withdraw");
	}
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getDeposit() {
		return deposit;
	}

	public void setDeposit(double deposit) {
		this.deposit = deposit;
	}

	public double getWithdraw() {
		return withdraw;
	}

	public void setWithdraw(double withdraw) {
		this.withdraw = withdraw;
	}
	
	
	
}
		
public class BankAccount {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
//    	AccountDetail ad = new AccountDetail();
    	System.out.println("ENTER YOUR CURRENT BALANCE  = ");
    	double balance = sc.nextDouble();
    	System.out.println("ENTER YOUR DEPOSITED AMOUNT  = ");
    	Double deposit = sc.nextDouble();
    	System.out.println("ENTER YOUR WITHDRAW AMOUNT = ");
    	Double withdraw = sc.nextDouble();
		
    	
    	AccountDetail ad = new AccountDetail(balance,deposit,withdraw);
    	
    	ad.balanceAfterDeposit();
    	ad.balanceAfterWithdraw();
    	ad.conclude();
	}
}


