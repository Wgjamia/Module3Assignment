package com.edureka.co.exam;

import java.util.Scanner;

public class CheckingAccount {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        BankAccount hRefBank = new BankAccount(1000);

        CurrentBankAccount CBA = new CurrentBankAccount();
        SBBankAccount SBA = new SBBankAccount(4);
        accountType aType = new accountType();
        System.out.println("Please Enter the ID for Account: ");
        hRefBank.setAccountId(scanner.nextInt());
        System.out.println("Please Enter the Name for Account: ");
        scanner.next();
        hRefBank.setName(scanner.nextLine());
        System.out.println("Please enter type of transaction 1 of deposit and 2 of withdraw(1 Or 2):");
        int typeTrans = scanner.nextInt();
        if (typeTrans == 1) {
            System.out.println("Please enter the Value:");
            hRefBank.setBalance(scanner.nextDouble());
            System.out.println("Please choose which type account you need please writ (CBA or SBA ) :");
            String str1 = scanner.next();
            if (str1.equals("CBA")) {
                aType.accountTypeph(CBA, 1,hRefBank.getBalance());
            } else if (str1.equals("SBA")) {
                aType.accountTypeph(SBA,1, hRefBank.getBalance());
            } else {
                System.out.println("Please the seam Account type (CBA or SBA ):");
                scanner.next();
            }
        }else if(typeTrans == 2){
            System.out.println("Please enter the Value:");
            hRefBank.setBalance(scanner.nextDouble());
            System.out.println("Please choose which type account you need please writ (CBA or SBA ) :");
            String str1 = scanner.next();
            if (str1.equals("CBA")) {
                aType.accountTypeph(CBA, 2,hRefBank.getBalance());
            } else if (str1.equals("SBA")) {
                aType.accountTypeph(SBA, 2,hRefBank.getBalance());
            } else {
                System.out.println("Please the seam Account type (CBA or SBA ):");
                scanner.next();
            }

        }else {
            System.out.println("the type not correct, Please try again : ");
            scanner.next();
        }





       // hRefBank.withdraw(19);

     //   hRefBank.getBalance();
    }
}
