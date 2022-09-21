package com.mindgate.main;

import java.util.Scanner;

import com.mindgate.pojo.Account;
import com.mindgate.pojo.Savings;

public class AccountMainV4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int accountnum;
		String name;
		double balance;
		double amount;
		int choice;
		String continueChoice;
		boolean result;
		boolean isSalary;

		System.out.print("Enter Account Number:");
		accountnum = scanner.nextInt();
		scanner.nextLine();
		System.out.print("Enter Name:");
		name = scanner.nextLine();

		System.out.print("Enter Balance:");
		balance = scanner.nextDouble();
		
		//Account account = new Account(accountnum, name, balance);
		
		System.out.println("Do you want to open salary account");
		isSalary = scanner.nextBoolean();
		Savings account = new Savings(accountnum, name, balance, isSalary);

		System.out.println(account);

		do {
			System.out.println("Menu");
			System.out.println("1.withdraw\n2.Deposite\n3.Balance");
			System.out.println("Enter Your Choice");
			choice = scanner.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter Amount to Withdraw");
				amount = scanner.nextDouble();
				result = account.withdraw(amount);
				if (result)
					System.out.println("Transaction Succesfull");
				else
					System.out.println("Transaction Failed");
				break;
			case 2:
				System.out.println("Enter Amount to Deposite");
				amount = scanner.nextDouble();
				result = account.deposite(amount);
				if (result)
					System.out.println("Transaction Succesfull");
				else
					System.out.println("Transaction Failed");
				break;
			case 3:
				System.out.println("Balance:: " + account);
				break;
			default:
				System.out.println("invalid choice");
				break;
			}
			System.out.println("Do you want to continue");
			continueChoice = scanner.next();

		} while (continueChoice.equals("yes"));
	}

}
