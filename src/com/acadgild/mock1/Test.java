package com.acadgild.mock1;

public class Test {
    public static void main(String[] args) {



        Bank bank1 = new Bank("HDFC", "Bangalore", 10, 0); // new Bank("HDFC", "Bangalore");
        Account testAccount2 = new Account(bank1, 100);

        Customer customer1 = new Customer(testAccount2);
        customer1.deposit(10);
        customer1.withdraw(11);
        System.out.println("customer1 = " + customer1.seeAccountBalance());



    }
}
