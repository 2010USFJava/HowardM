package com.monicahoward.dao;

import com.monicahoward.beans.Employee;

import java.sql.SQLException;

public interface EmployeeDao {

    Employee retrieveById(int id) throws SQLException;

    Employee login(String userName, String password) throws SQLException;

}
