package com.monicahoward.beans;

import java.util.Scanner;

public class Customer {
    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    private int customerId;
    private String name;
    private String username;
    private String password;
    private String accountNumber;

    public Customer(int customerId, String name, String username, String password, String accountNumber){
        this.customerId = customerId;
        this.name = name;
        this.username = username;
        this.password = password;
        this.accountNumber = accountNumber;
    }

    public Customer() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

//    public void setAccountNumber(String accountNumber) {
//        this.accountNumber = accountNumber;
//    }

    public String getName() {
        return name;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

//    public String getAccountNumber() {
//        return accountNumber;
//    }


//    private static final long serialVersionUID = 1L;
//    public String accountNumber;
    private static double balance = 0;



    private double value = 0;
//        private String type;

    static Scanner sc = new Scanner(System.in);
//        double value = sc.nextDouble();


    public void CustomerAccount(String accountNumber) {
        this.accountNumber = accountNumber;


    }
    public void CustomerAccount(String accountNumber, double balance) {
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
        return "Customer{" +
                "cutomerId" + customerId + '\'' +
                "name='" + name + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                '}';
    }
}


