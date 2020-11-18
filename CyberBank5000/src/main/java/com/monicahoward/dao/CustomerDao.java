package com.monicahoward.dao;

import com.monicahoward.beans.Customer;

import java.sql.SQLException;
import java.util.List;

public interface CustomerDao {
    //crud operations
    List<Customer> getAllCustomers() throws SQLException;

    void register(Customer custo) throws SQLException;

    void login(String username, String customerpassword) throws SQLException;

}
