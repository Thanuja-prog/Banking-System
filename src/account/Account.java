package account;

public class Account { 
	protected int accountNumber;
	protected double balance;
	
	public Account(int accountNumber, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	public void deposit(double amount) {
		balance = balance+amount;
		System.out.println(amount+"Deposited");
	}
	
	public void withdraw(double amount) {
		if(balance >= amount) {
			balance = balance - amount;
			System.out.println(amount+"withdrawn");
		}
		else {
			System.out.println("Insufficient balance");
		}
	}
	
	public void checkBalance() {
		System.out.println("Current Balance"+ balance);
	}
	

}