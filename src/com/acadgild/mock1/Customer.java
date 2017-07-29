package com.acadgild.mock1;

public class Customer {
    String name;
    String address;

    Bank bank;
    Account testAccount;

    public Customer(Account account) {
        testAccount = account;
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
