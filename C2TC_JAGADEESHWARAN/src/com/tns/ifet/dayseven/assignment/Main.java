package com.tns.ifet.dayseven.assignment;

public class Main {
	 public static void main(String[] args) {
	        @SuppressWarnings("unused")
			Bank bank = new Bank();
	        System.out.println("Total Accounts: " + Bank.getTotalAccounts());
	        Account savings = new SavingsAccount(1000);
	        Account checking = new CheckingAccount(500);
	        Transaction transaction = new Transaction();
	        
	        transaction.performTransaction(savings, 200, true); // Deposit in savings
	        transaction.performTransaction(checking, 100, false); // Withdraw from checking
	        System.out.println("Savings Balance: " + savings.getBalance());
	        System.out.println("Checking Balance: " + checking.getBalance());
	    }
}
