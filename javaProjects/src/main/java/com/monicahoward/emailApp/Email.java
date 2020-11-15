package com.monicahoward.emailApp;

public class Email {
    // first name, last name, password, department, email capacity, alternate email.
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int emailCapacity;
    private String alternateEmail;

    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getEmailCapacity() {
        return emailCapacity;
    }

    public void setEmailCapacity(int emailCapacity) {
        this.emailCapacity = emailCapacity;
    }

    public String getAlternateEmail() {
        return alternateEmail;
    }

    public void setAlternateEmail(String alternateEmail) {
        this.alternateEmail = alternateEmail;
    }
}
