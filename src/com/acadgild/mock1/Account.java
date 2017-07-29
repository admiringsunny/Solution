package com.acadgild.mock1;

public class Account {

    private String accountAssociatedToBank;
    private String accountNumber;
    private double balance;


    // create new account in a bank
    public Account(Bank bank, double balance) {
        if (bank.approveTransaction()) {
            this.accountAssociatedToBank = bank.getName();
            this.balance = balance;
            accountNumber = bank.getName() + (bank.getNumberOfAccount() - bank.getNumberOfCustomer() + 1);
            bank.setNumberOfAccount(bank.getNumberOfAccount() - 1);
        }
    }

    double getBalance() {
        return this.balance;
    }

    void withdraw(double withdrawAmount) {
        this.balance = balance - withdrawAmount;
    }

    void deposit(double depositAmount) {

        this.balance = balance + depositAmount;
    }
}
