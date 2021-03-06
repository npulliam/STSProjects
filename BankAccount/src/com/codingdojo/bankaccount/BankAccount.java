package com.codingdojo.bankaccount;
import java.util.Random;

public class BankAccount {
	private String accountNumber;
	private double checkingBalance;
	private double savingsBalance;
	public static int numOfAccounts = 0;
	public static double totalAmtStored = 0.0;
	
	private static String randomAccountNum() {
		String accountNum = "";
		for(int i = 0; i<10; i++) {
			Random r = new Random();
			accountNum += r.nextInt(10);
		}
		return accountNum;
	}
	
	public BankAccount() {
		this.accountNumber = randomAccountNum();
		this.checkingBalance = 0.0;
		this.savingsBalance = 0.0;
		numOfAccounts++;
		totalAmtStored += (this.checkingBalance + this.savingsBalance);
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	private void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getCheckingBalance() {
		return checkingBalance;
	}

	private void setCheckingBalance(double checkingBalance) {
		this.checkingBalance = checkingBalance;
	}

	public double getSavingsBalance() {
		return savingsBalance;
	}

	private void setSavingsBalance(double savingsBalance) {
		this.savingsBalance = savingsBalance;
	}
	
	public void depositMoney(String accountName, double depositAmt) {
		if(accountName == "checking") {
			this.setCheckingBalance(this.getSavingsBalance() + depositAmt);
			totalAmtStored += depositAmt;
		} else if (accountName == "savings") {
			this.setSavingsBalance(this.getSavingsBalance() + depositAmt);
			totalAmtStored += depositAmt;
		} else {
			System.out.println("Account Name not recognized.");
		}
	}
	public void withdrawMoney(String accountName, double withdrawAmt) {
		if(accountName == "checking") {
			if(withdrawAmt < this.getCheckingBalance()) {
				this.setCheckingBalance(this.getSavingsBalance() - withdrawAmt);
				totalAmtStored -= withdrawAmt;				
			} else {
				System.out.println("Insufficient funds");
			}
			
		} else if (accountName == "savings") {
			if(withdrawAmt < this.getSavingsBalance()) {
				this.setSavingsBalance(this.getSavingsBalance() - withdrawAmt);
				totalAmtStored -= withdrawAmt;
			} else {
				System.out.println("Insufficient funds");
			}
			
		} else {
			System.out.println("Account name not recognized");
		}
	}
	public void showTotalAcctFunds() {
		System.out.println(this.getCheckingBalance() + this.getSavingsBalance());
	}
	public static void showTotalBankFunds() {
		System.out.println(totalAmtStored);
	}
}
