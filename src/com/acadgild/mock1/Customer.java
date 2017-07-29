package com.acadgild.mock1;

public class Customer {
    String name;
    String address;

    Bank bank;
    Account testAccount;

    public Customer(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public Customer(Account account) {
        bank = new Bank("HDFC", "Bangalore", 10, 0); // new Bank("HDFC", "Bangalore");
        testAccount = new Account(bank, 100);
    }

    void deposit(double depositAmount) {
        testAccount.deposit(depositAmount);
    }

    void withdraw (double withdrawAmount) {
        testAccount.withdraw(withdrawAmount);
    }

    String seeAccountBalance() {

        return String.valueOf(testAccount.getBalance());
    }

    boolean closeAccount() {

        return true;
    }





}
