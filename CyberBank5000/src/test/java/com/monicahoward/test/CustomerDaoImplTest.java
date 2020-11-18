//package com.monicahoward.test;
//
//import com.monicahoward.beans.Customer;
//import com.monicahoward.daoimpl.CustomerDaoImpl;
//import com.monicahoward.utils.ConnFactory;
//
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//
//public class CustomerDaoImplTest {
//    static CustomerDaoImpl cdi = new CustomerDaoImpl();
//    static ConnFactory cf = ConnFactory.getInstance();
//    static Connection conn = cf.getConnection();
//
//    //p.execute is true/false
//    //p.executeQuery for resultset object
//    //p.executeUpdate for insert, delete, update statements
//
//    @After
//    public void deleteNewData() {
//        try {
//            PreparedStatement p = conn.prepareStatement("delete from \"Customer\" where \"Username\"='TestUsertest'");
//            p.executeUpdate();
//        } catch (SQLException e) {
//            System.out.println("delete problems");
//            e.printStackTrace();
//        }
//    }
//
//    @Test
//    public void testNewCustomer() {
//        Customer c = new Customer( 0,  "name",  "username",  "password",  0);
//        try {
//            cdi.register(c);
//            PreparedStatement ps = conn.prepareStatement("select * from \"Customer\" where \"Username\"=\'TestUsertest\'");
//            ResultSet rs = ps.executeQuery();
//            Customer cust = null;
//            if(rs!=null) {
//                while(rs.next()) {
//                    cust = new Customer(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),
//                            rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10),rs.getInt(11));
//                    System.out.println(cust.toString());
//                }
//            }else {
//                fail("Test failure");
//            }
//        } catch (SQLException e) {
//            System.out.println("testNewCustomer problem");
//            e.printStackTrace();
//        }
//    }
//
//
//}
