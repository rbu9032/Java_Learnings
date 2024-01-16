package com.java.practice;

public class Bank {

    static int currentBalance = 2000;
    public static void greet() {
        System.out.println("Hi, Welcome to the Banking Application");
    }

    public void deposit(int amount) {
        currentBalance = currentBalance + amount;
        System.out.println("Amount deposited successfully and Available balance: " + currentBalance);
    }
    public static void withdrawal(int debit) {
        currentBalance = currentBalance - debit;
        System.out.println("Amount withdrawn successfully and Available balance: " + currentBalance);
    }
    public  int getCurrentBalance() {
        return currentBalance;
    }
    public static void main(String[] args) {
        /*  Accessing non-static methods in static methods
         * Bank bk = new Bank(); new Bank().greet();
         */
        Bank bk = new Bank();
        greet();
        System.out.println("Current Balance: " + currentBalance);
        bk.deposit(234);
        withdrawal(500);
        System.out.println("Available Balance: " + bk.getCurrentBalance());
    }

}
