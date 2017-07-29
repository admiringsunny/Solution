package com.acadgild.mock1;

public class Account1 {

    private String accountAssociatedToBank;
    private String accountNumber;
    private double balance;


    public Account1(String accountAssociatedToBank, String accountNumber, double balance) {
        this.accountAssociatedToBank = accountAssociatedToBank;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountAssociatedToBank() {
        return this.accountAssociatedToBank;
    }

    public void setAccountAssociatedToBank(String accountAssociatedToBank) {

    }

    public double getBalance() {
        return balance;
    }


    void withdraw(double withdrawAmount) {

        balance = balance - withdrawAmount;
    }

    void diposit(double dipositAmount) {

        balance = balance + dipositAmount;
    }

}
