package com.revature.users;

import java.io.Serializable;
import java.util.Scanner;

public class CustomerAccount implements Serializable {

        private static final long serialVersionUID = 1L;
        public String accountNumber;
        private static double balance = 0;



    private double value = 0;
//        private String type;

        static Scanner sc = new Scanner(System.in);
//        double value = sc.nextDouble();


    public CustomerAccount(String accountNumber) {
            this.accountNumber = accountNumber;


        }
        public CustomerAccount(String accountNumber, double balance) {
            this.accountNumber = accountNumber;

            this.setBalance(balance);

        }
        public String getAccountNumber() {
            return accountNumber;
        }
        public void setAccountNumber(String accountNumber) {
            this.accountNumber = accountNumber;
        }
        public  double getBalance() {
            return balance;
        }
        public  void setBalance(double balance) {
              this.balance = balance;
        }
//

    public static void withdrawal() {
        System.out.println("Please enter the amount that you would like to withdraw.");

        double value = Double.parseDouble(sc.nextLine());
        if(value >=0 && balance > value ) {
            balance -=value;
            System.out.println("                         ");
            System.out.println("$ $ $ $ $ $ $ $ $ $ $ $ $");
            System.out.println(" Withdrawal Successful! ");
            System.out.println("Your new balance is: " + balance);
            System.out.println("$ $ $ $ $ $ $ $ $ $ $ $ $");
            System.out.println("                         ");



        }else {
            System.out.println("*********************************************************");
            System.out.println("* P L E A S E  M A K E  A  V A L I D  S E L E C T I O N *");
            System.out.println("*********************************************************");
        }

        }


        public static void deposit() {
            System.out.println("Please enter the amount that you would like to deposit.");
            double value = Double.parseDouble(sc.nextLine());
            if(value >=0 ) {
                balance +=value;

                System.out.println("Deposit Successful!");
                System.out.println("Your new balance is: " + balance);
            }else {
                System.out.println("*********************************************************");
                System.out.println("* P L E A S E  M A K E  A  V A L I D  S E L E C T I O N *");
                System.out.println("*********************************************************");
            }
    }

        @Override
        public String toString() {
            return "Account " + accountNumber + " = $" + balance;
        }



}
