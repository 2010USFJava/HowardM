package com.monicahoward.dao;

import com.monicahoward.beans.Customer;

import java.sql.SQLException;
import java.util.List;

public interface CustomerDao {
    //crud operations
    public List<Customer> getAllCustomers() throws SQLException;

}
