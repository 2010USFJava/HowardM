package com.bankofamerica.accounts;

public class Employee extends AccountHolder {

    private String title;
    private String employeeId;

    public Employee() {

    }

    public Employee(String firstName, String lastName, String phoneNumber, String title, String employeeId) {
        super(firstName, lastName, phoneNumber);
        this.title = title;
        this.employeeId = employeeId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "title='" + title + '\'' +
                ", employeeId='" + employeeId + '\'' +
                '}';
    }
}
