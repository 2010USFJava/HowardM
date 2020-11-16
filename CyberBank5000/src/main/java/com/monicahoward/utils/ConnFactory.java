package com.monicahoward.utils;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnFactory {
    //Singleton Factory
    //Private Static instance of itself

    private static ConnFactory cf;

    // private no args constructor
    private ConnFactory(){
        super();
    }

    //public static synchronized "getter" method
    public static synchronized ConnFactory getInstance(){
        if(cf == null){
            cf= new ConnFactory();
        }
        return cf;
    }

    //methods that do stuff
    public Connection getConnection(){
        Connection conn= null;
        Properties prop = new Properties();
//        String url = "jdbc:postgresql://java2020.cb5wgdcxbqnp.us-east-2.rds.amazonaws.com:5432/postgres";
//        String username= "javamaster";
//        String password= "waterboy";



    try {
        prop.load(new FileReader("database.properties"));
        conn = DriverManager.getConnection(
                prop.getProperty("url"),
                prop.getProperty("username"),
                prop.getProperty("password")
        );
    } catch (
    SQLException e) {
        e.printStackTrace();
    } catch (
    FileNotFoundException e) {
        e.printStackTrace();
    } catch (
    IOException e) {
        e.printStackTrace();
    }
        return conn;
}
}
