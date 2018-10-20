package com.edureka.co.exam;

import java.lang.reflect.Method;

public class accountType {

    public void accountTypeph(BankAccount opjBan,int typeTrans, double amount){
        if (typeTrans == 1) {
            System.out.println("the deposited is :"+ opjBan.deposit(amount));

        }
        else if (typeTrans == 2) {
            System.out.println("Tehw Withdrawed is :"+opjBan.withdraw(amount));
        }
        else {
            System.out.println("Please this type (1 or 2)!");
        }
    }



}
