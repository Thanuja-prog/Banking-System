package account;

public class SavingsAccount extends Account {

    public SavingsAccount(int accountNumber, double balance) {

        super(accountNumber, balance);
    }

    @Override
    public void withdraw(double amount) {

        if(balance - amount >= 500) {

            balance = balance - amount;

            System.out.println(amount + " Withdrawn From Saving");
        }

        else {

            System.out.println("Minimum Balance Required");
        }
    }
}