package com.monicahoward.beans;

public class Customer {
    String name;
    String username;
    String password;
    String accountNumber;

    public Customer(String name, String username, String password, String accountNumber){
        this.name = name;
        this.username = name;
        this.password = password;
        this.accountNumber = accountNumber;
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

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getName() {
        return name;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                '}';
    }
}


