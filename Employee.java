package com.monicahoward.employee;

public class Employee {
    private String name;
    private String phoneNumber;
    private String title;

    public Employee() {
    }

    public Employee(String name, String phoneNumber, String title) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.title = title;
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
