package com.edureka.co.exam;

public class BankAccount {

    private int accountId;
    private String name;
    private double balance;

    public BankAccount(int accountId, String name, accountType typeOp) {
        this.accountId = accountId;
        this.name = name;
        this.balance = 0.0;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }


    // public BankAccount()
    //{
     //   balance = 0;
   // }

    public BankAccount(double initialBalance)
    {
        balance = initialBalance;
    }

    // Methods
    public double deposit(double amount)
    {
        balance = balance + amount;
        return balance;
    }

    public double withdraw(double amount)
    {
        balance = balance - amount;
        return balance;

    }

    public double getBalance()
    {
        System.out.println("Your Account has Balance is : ("+balance+")");
        return(balance);
    }



}
