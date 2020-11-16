package com.monicahoward.daoimpl;

import com.monicahoward.beans.Customer;
import com.monicahoward.dao.CustomerDao;
import com.monicahoward.utils.ConnFactory;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CustomerDaoImpl implements CustomerDao {

    public static ConnFactory cf = ConnFactory.getInstance();

//this is a comment
    @Override
    public List<Customer> getAllCustomers() throws SQLException {
        List<Customer>customerList= new ArrayList<Customer>();
        Connection conn= cf.getConnection();
        Statement stmt= conn.createStatement();
        ResultSet rs = stmt.executeQuery("select * from \"Customer\"");
        Customer custo= null;
        while(rs.next()){
            custo= new Customer(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
            customerList.add(custo);
        }
        return customerList;
    }
}
