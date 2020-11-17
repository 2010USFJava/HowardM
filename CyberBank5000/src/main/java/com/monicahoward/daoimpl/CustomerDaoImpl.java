package com.monicahoward.daoimpl;

import com.monicahoward.beans.Customer;
import com.monicahoward.dao.CustomerDao;
import com.monicahoward.utils.ConnFactory;

import java.sql.*;
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
        ResultSet rs = stmt.executeQuery("select * from customer");
        Customer custo= null;
        while(rs.next()){
            custo= new Customer(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
            customerList.add(custo);
        }
        return customerList;
    }

    public void  Customer register(Customer custo) throws SQLException {
        Connection conn = cf.getConnection();
        String sql = "insert into customers values(?,?)";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, custo.getCustomerId());
        ps.setString(2, custo.getName());
        ps.executeUpdate();
    }


}
