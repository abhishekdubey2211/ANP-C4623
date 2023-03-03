package corejava;
class Main1
{
	public static void main(String[] args)
	{
		//creating object for BankAccount Class
		BankAccount ba = new BankAccount(1000,"123456");
		
		//calling getBalance and getAccountNumber
		System.out.println("Bank Account number : "+ba.getAccountNumber()+ "\nInitial Bank Balance : "+ ba.getBalance());
		ba.deposit(500);
		ba.wihdraw(200);
	}
}
