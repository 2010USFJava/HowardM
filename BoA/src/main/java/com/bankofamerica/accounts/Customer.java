package com.bankofamerica.accounts;

public class Customer extends AccountHolder {
    private String accountNumber;
    private double openingDeposit;
    private double balance;
    private double withdrawl;
    private double deposit;
    private boolean isCommercial;

    public Customer() {
    }

    public Customer(String firstName, String lastName, String phoneNumber, String accountNumber, double openingDeposit, double balance, double withdrawl, double deposit, boolean isCommercial) {
        super(firstName, lastName, phoneNumber);
        this.accountNumber = accountNumber;
        this.openingDeposit = openingDeposit;
        this.balance = balance;
        this.withdrawl = withdrawl;
        this.deposit = deposit;
        this.isCommercial = isCommercial;


    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getOpeningDeposit() {
        return openingDeposit;
    }

    public void setOpeningDeposit(double openingDeposit) {
        this.openingDeposit = openingDeposit;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getWithdrawl() {
        return withdrawl;
    }

    public void setWithdrawl(double withdrawl) {
        this.withdrawl = withdrawl;
    }

    public double getDeposit() {
        return deposit;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }

    public boolean isCommercial() {
        return isCommercial;
    }

    public void setCommercial(boolean commercial) {
        isCommercial = commercial;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "accountNumber='" + accountNumber + '\'' +
                ", openingDeposit=" + openingDeposit +
                ", balance=" + balance +
                ", withdrawl=" + withdrawl +
                ", deposit=" + deposit +
                ", isCommercial=" + isCommercial +
                '}';
    }
}
