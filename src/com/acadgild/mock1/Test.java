package com.acadgild.mock1;

public class Test {
    public static void main(String[] args) {

//        Account1 testAccount1 = new Account1("HDFC", "2001", 500);
//        testAccount1.withdraw(50.50);
//        testAccount1.diposit(100.45);
//        System.out.println("Balance: " + testAccount1.getBalance());



        Bank bank1 = new Bank("HDFC", "Bangalore", 10, 0); // new Bank("HDFC", "Bangalore");
        Account testAccount2 = new Account(bank1, 100);
        testAccount2.withdraw(10);

        Customer customer1 = new Customer(testAccount2);
        customer1.deposit(10);
        customer1.withdraw(11);
        System.out.println("customer1 = " + customer1.seeAccountBalance());

        customer1.closeAccount();


//        System.out.println("Balance2: " + testAccount2.getBalance());
//        System.out.println("bank1.getNumberOfAccount() = " + bank1.getNumberOfAccount());



    }
}
