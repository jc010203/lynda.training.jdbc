package com.lynda.training;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {


    private static final String CONN_STRING = "jdbc:mysql://localhost/explorecalifornia";
    private static final String USER = "dbuser";
    private static final String PASSWORD = "dbpassword";

    public static void main(String[] args) {
	// write your code here

        Connection conn = null;

        try {
            conn = DriverManager.getConnection(CONN_STRING, USER, PASSWORD);
            System.out.println("connected!");

        } catch(SQLException e){
            System.err.println(e.getMessage());
        }
    }
}
