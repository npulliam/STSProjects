package com.codingdojo.bankaccount;

public class BankTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount account_1 = new BankAccount();
		account_1.depositMoney("checking", 300.0);
		account_1.depositMoney("savings", 50.0);
		account_1.showTotalAcctFunds();
		BankAccount account_2 = new BankAccount();
		BankAccount.showTotalBankFunds();
		account_2.depositMoney("checking", 500.0);
		account_2.withdrawMoney("savings", 50.0);
		BankAccount.showTotalBankFunds();
		account_2.depositMoney("my checking", 50);
	}

}
