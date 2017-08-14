package com.lynda.training;

import com.sun.tools.internal.ws.wsdl.document.soap.SOAPUse;

import java.sql.*;

public class Main {

    //public static final String CONN_STRING = "jdbc:mysql://localhost/explorecalifornia";
    public static final String CONN_STRING = "jdbc:hsqldb:data/explorecalifornia";
    public static final String USER = "dbuser";
    public static final String PASSWORD = "dbpassword";

    public static void main(String[] args) {
	// write your code here
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            conn = DriverManager.getConnection(CONN_STRING, USER, PASSWORD);
            System.out.println("successfully connected");
        } catch (SQLException e) {
            System.err.println(e.getMessage());
            System.err.println(e.getErrorCode());
        }
    }
}
