package com.monicahoward.customer;

public class Customer  {
    private String name;
    private String phoneNumber;
    private String customerType;

    public Customer(){}

    public Customer(String name, String phoneNumber, String customerType){
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.customerType = customerType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public String toString(){
        return "Customer [name=" + name + ", phoneNumber= " + phoneNumber + ", customerType =" + customerType + " ";
    }
}
