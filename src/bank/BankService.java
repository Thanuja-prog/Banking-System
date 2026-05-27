package bank;

import java.util.Scanner;
import account.Account;

public class BankService {

    Scanner sc = new Scanner(System.in);

    public void start(Account acc) {

        int choice;

        do {

            System.out.println("\n===== BANK MENU =====");

            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");

            System.out.print("Enter Choice : ");

            choice = sc.nextInt();

            switch(choice) {

                case 1:

                    System.out.print("Enter Amount : ");

                    double depositAmount = sc.nextDouble();

                    acc.deposit(depositAmount);

                    break;

                case 2:

                    System.out.print("Enter Amount : ");

                    double withdrawAmount = sc.nextDouble();

                    acc.withdraw(withdrawAmount);

                    break;

                case 3:

                    acc.checkBalance();

                    break;

                case 4:

                    System.out.println("Thank You");

                    break;

                default:

                    System.out.println("Invalid Choice");
            }

        } while(choice != 4);
    }
}