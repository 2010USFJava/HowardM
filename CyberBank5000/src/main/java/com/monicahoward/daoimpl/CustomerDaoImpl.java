package com.monicahoward.daoimpl;

import com.monicahoward.beans.Customer;
import com.monicahoward.dao.CustomerDao;
import com.monicahoward.utils.ConnFactory;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

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

    public void register(Customer custo) throws SQLException {
        Connection conn = cf.getConnection();
        String sql = "insert into customer values(default,?,?,?,?)";
        PreparedStatement ps = conn.prepareStatement(sql);
//        ps.setInt(1, custo.getCustomerId());
        ps.setString(1, custo.getName());
        ps.setString(2, custo.getUsername());
        ps.setString(3, custo.getPassword());
        ps.setString(4, custo.getAccountNumber());

        int rowsInserted = ps.executeUpdate();
        if(rowsInserted > 0){
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("                            S U C C E S S                                      ");
            System.out.println(custo.getName().toUpperCase() + " " + "your account has been created with the following info: ");
            System.out.println("               U S E R N A M E : " + custo.getUsername() + "                   ");
            System.out.println("               P A S S W O R D : " + custo.getPassword()+ "                    ");
            System.out.println("         A C C O U N T  N U M B E R : " + custo.getAccountNumber()+ "          ");
            System.out.println("Please log in later to check the status of your account");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        }
        ps.executeUpdate();
    }

    public void login(String username, String customerpassword) throws SQLException{
         CustomerDaoImpl cdi = new CustomerDaoImpl();

        Connection conn = cf.getConnection();
        String sql = "select * from customer where username=? and customerpassword=?";
//        PreparedStatement ps = conn.prepareStatement(sql);

        try{
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, username);
            ps.setString(2, customerpassword);

            Properties props = new Properties();
//            String custoUName = (String) props.get(custoUName);
//            String custoPass = (String) props.get(custoPass);
            ResultSet rs = ps.executeQuery();

            if(rs.next()){
                Customer c = new Customer();
                c.setName(rs.getString("customername"));
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("                      Welcome back,  " + c.getName()                            );
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

//                System.out.println(rs.getString("password"));
            }
            if(rs.next() == false){
                System.out.println("! ! ! ! ! ! ! ! ! ! ! !   E R R O R  ! ! ! ! ! ! ! ! ! ! ! !");
                System.out.println("Sorry, there is no account with that username/password combo");
                System.out.println("! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! !  ! ! ! ! ! ! ! ! ! ! !");

            }
            else {
                throw new SQLException();
            }

        } catch (SQLException e){
            e.printStackTrace();
        }
    }
    public void checkBalance(){
        System.out.println("Here's your balance: ");
    }
    public void deposti(){
        System.out.println("Make a deposit");
    }
    public void withdrawl(){
        System.out.println("Withdrawl");
    }



}
