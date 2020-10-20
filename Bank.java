package com.monicahoward.bank;

import com.monicahoward.customer.Customer;
import com.monicahoward.employee.Employee;

public class Bank {
    public static void main(String[] args){
        Customer mattKnighten = new Customer("Matt Knighten", "123456789", "personal");
        System.out.println(mattKnighten);

        Employee monicaHoward = new Employee("Monica Howard", "987654321", "The Boss");
        System.out.println(monicaHoward);

    }
}
