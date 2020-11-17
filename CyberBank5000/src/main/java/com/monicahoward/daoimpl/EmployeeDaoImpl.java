package com.monicahoward.daoimpl;

import com.monicahoward.beans.Employee;
import com.monicahoward.dao.EmployeeDao;
import com.monicahoward.utils.ConnFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

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

        while (rs.next()){
            emp = new Employee(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4));
        }
        return emp;
    }

    public Employee login(String userName, String password) throws SQLException {
        Connection conn = cf.getConnection();
        try {
            PreparedStatement ps = conn.prepareStatement("Select * from employee WHERE  userName=? AND password=?");
            ps.setString(1, userName);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                return fromUserResultSet(rs);
            }
        }catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
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
