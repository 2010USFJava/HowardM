package com.monicahoward.daoimpl;

import com.monicahoward.beans.Employee;
import com.monicahoward.dao.EmployeeDao;
import com.monicahoward.utils.ConnFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class EmployeeDaoImpl implements EmployeeDao {
    public static ConnFactory cf = ConnFactory.getInstance();

    @Override
    public Employee retrieveById(int id) throws SQLException {

        Connection conn = cf.getConnection();
        String sql = "select * from employees where id=?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, id);
        ResultSet rs = ps.executeQuery();
        Employee emp = null;

        while (rs.next()) {
            emp = new Employee(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4));
        }
        return emp;
    }

    public void login(String username, String password) throws SQLException {
        EmployeeDaoImpl edi = new EmployeeDaoImpl();
        Connection conn = cf.getConnection();
        String sql = "select * from employee where username=? and password=";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, username);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();

            Properties props = new Properties();
//            String custoUName = (String) props.get(custoUName);
//            String custoPass = (String) props.get(custoPass);

            if (rs.next()) {
                Employee e = new Employee();
                e.setName(rs.getString("name"));
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("                      Welcome back,  " + e.getName());
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

//                System.out.println(rs.getString("password"));
            }
            if (rs.next() == false) {
                System.out.println("! ! ! ! ! ! ! ! ! ! ! !   E R R O R  ! ! ! ! ! ! ! ! ! ! ! !");
                System.out.println("Sorry, there is no employee account with that username/password combo");
                System.out.println("! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! !  ! ! ! ! ! ! ! ! ! ! !");

            } else {
                throw new SQLException();
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    private Employee fromUserResultSet(ResultSet rs) throws SQLException {
        Employee employee = new Employee();

        employee.setId(rs.getInt("id"));
        employee.setName(rs.getString("name"));
        employee.setUsername(rs.getString("username"));
        employee.setPassword(rs.getString("password"));

        return employee;
    }


}
