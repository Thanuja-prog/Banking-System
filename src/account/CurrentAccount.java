package account;

public class CurrentAccount extends Account {

	public CurrentAccount(int accountNumber, double balance) {
		super(accountNumber, balance);
	}
	
	@Override
	public void withdraw(double amount) {
		balance =balance-amount;
		System.out.println(amount+"Withdraw from Current Account");
	}

}