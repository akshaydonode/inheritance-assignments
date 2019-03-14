package com.capgemini.employee.model;

public class SavingBankAccount extends BankAccount{
	
	private final double withdrawLimit = 15000;

	public SavingBankAccount(long accountId, String accountHolderName, String accountType, double accountBalance) {
		super(accountId, accountHolderName, accountType, accountBalance);
		// TODO Auto-generated constructor stub
	}

	public double withdraw(double amount) {
		
		if (amount < withdrawLimit && getAccountBalance() >= amount)
			setAccountBalance(getAccountBalance() - amount);
		else
			System.out.println("You don't have sufficient balance. OR Your Withdraw Limit is exceeded");
		return getAccountBalance();
	}
}
