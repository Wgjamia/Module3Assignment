package com.edureka.co.exam;

public class CurrentBankAccount extends BankAccount {

    private int transCount;


    public CurrentBankAccount() {
        super(1000);
        this.transCount =0;
    }

    @Override
    public double deposit(double amount)
    {
        double baln = super.deposit(amount);
        transCount++;
        return baln;

    }
    @Override
    public double withdraw(double amount)
    {
        double baln = super.withdraw(amount);
        transCount++;
        return baln;
    }

}
