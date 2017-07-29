package com.acadgild.mock1;

public class Bank {

    private String name;
    private String location;
    private int numberOfAccount;
    private int numberOfCustomer;

    public Bank(String name, String location, int numberOfAccount, int numberOfCustomer) {
        this.name = name;
        this.location = location;
        this.numberOfAccount = numberOfAccount;
        this.numberOfCustomer = numberOfCustomer;
    }

    public String getName() {
        return this.name;
    }

    boolean approveTransaction() {
        if (getNumberOfAccount() > 0)
            return true;

        return false;
    }

    public int getNumberOfCustomer() {
        return this.numberOfCustomer;
    }

    public int getNumberOfAccount() {
        return numberOfAccount;
    }

    public void setNumberOfAccount(int numberOfAccount) {
        this.numberOfAccount = numberOfAccount;
    }
}
