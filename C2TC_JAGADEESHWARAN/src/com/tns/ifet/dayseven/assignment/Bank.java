package com.tns.ifet.dayseven.assignment;

public class Bank {
	 private static int totalAccounts = 0;
	    public Bank() {
	        totalAccounts++;
	    }
	    public static int getTotalAccounts() {
	        return totalAccounts;
	    }
}
