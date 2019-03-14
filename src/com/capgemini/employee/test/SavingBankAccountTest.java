package com.capgemini.employee.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.capgemini.employee.model.SavingBankAccount;

public class SavingBankAccountTest {

	private SavingBankAccount savingAccount;
	@BeforeEach
	public void setUp()  {
		savingAccount = new SavingBankAccount(111,"AMD","SAVING",20000);
	}

	@Test
	public void testMoneyIsDeposited() {
		savingAccount = new SavingBankAccount(111,"AMD","SAVING",20000);
		assertEquals(25000, savingAccount.deposit(5000));
		
	}
	
	@Test
	public void testWithdrawMoneyForSuficientBalance() {
		assertEquals(10000, savingAccount.withdraw(10000));
	}

	@Test
	public void testWithdrawMoneyForInsuficientBalanceORExceedWithdrawLimit() {
		String expected="You don't have sufficient fund";
		assertEquals(20000, savingAccount.withdraw(16000));
	}
}
