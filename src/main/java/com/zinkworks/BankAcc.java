package com.zinkworks;

public class BankAcc {
    private int accNo;
    private int balance;
    private String customerName;

    // Constructors
    public BankAcc(int accNo, int balance, String customerName) {
        this.accNo = accNo;
        this.customerName = customerName;
        this.balance = balance;
    }

    public BankAcc(String customerName) {
        this(123445, 60000, customerName);
    }

    public int getAccNo() {
        return accNo;
    }

    public void setAccNo(int accNo) {
        this.accNo = accNo;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void deposit(int amount) {
        this.balance += amount;
        System.out.println("You deposited €" + amount + ". You now have €" + this.balance);
    }

    public void withdraw(int amount) {
        if (amount > this.balance) {
            System.out.println("Insufficient funds to withdraw €" + amount);
        } else {
            this.balance -= amount;
            System.out.println("You withdrew €" + amount + ". You now have €" + this.balance);
        }
    }
}
