package main;

import java.util.Scanner;

import user.User;
import account.SavingsAccount;
import account.CurrentAccount;
import account.Account;
import bank.BankService;

public class Main {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("********* BANK MANAGEMENT SYSTEM *********");

        // User Input
        System.out.print("Enter User ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter User Name: ");
        String name = sc.nextLine();

        User user = new User(id, name);

        System.out.println("\nUser Created Successfully");
        user.displayUser();

        // Account Selection
        System.out.println("\nSelect Account Type");
        System.out.println("1. Savings Account");
        System.out.println("2. Current Account");

        int type = sc.nextInt();

        System.out.print("Enter Account Number: ");
        int accNo = sc.nextInt();

        System.out.print("Enter Initial Balance: ");
        double balance = sc.nextDouble();

        Account acc;

        if (type == 1) {
            acc = new SavingsAccount(accNo, balance);
        } else {
            acc = new CurrentAccount(accNo, balance);
        }

        BankService bank = new BankService();
        bank.start(acc);

        sc.close();
    }
}