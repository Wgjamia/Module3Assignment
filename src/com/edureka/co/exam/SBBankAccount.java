package com.edureka.co.exam;

public class SBBankAccount extends BankAccount {

    private double interestRate;

    public SBBankAccount(double rate)
    {
        super(1000);
        interestRate = rate;
    }



    @Override
    public double deposit(double amount)
    {
        double interest = getBalance() * (interestRate / 100);

        double ins = super.deposit(interest);
        return ins;

    }
    @Override
    public double withdraw(double amount)
    {
        double interest = getBalance() * (interestRate / 100);
        double ins = super.withdraw(interest);
        return ins;


    }

}
