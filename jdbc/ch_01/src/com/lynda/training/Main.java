package com.lynda.training;

import com.sun.org.apache.regexp.internal.RE;
import com.sun.tools.internal.ws.wsdl.document.soap.SOAPUse;

import java.sql.*;

public class Main {

    //public static final String CONN_STRING = "jdbc:mysql://localhost/explorecalifornia";
    public static final String CONN_STRING = "jdbc:hsqldb:data/explorecalifornia";
    public static final String USER = "dbuser";
    public static final String PASSWORD = "dbpassword";
    public static final String SQL = "select * from STATES";

    public static void main(String[] args) throws SQLException {
	// write your code here
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            conn = DriverManager.getConnection(CONN_STRING, USER, PASSWORD);
            System.out.println("successfully connected");

            stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            rs = stmt.executeQuery(SQL);

            rs.last();
            System.out.println("number of rows: " + rs.getRow());


        } catch (SQLException e) {
            System.err.println(e.getMessage());
            System.err.println(e.getErrorCode());
        } finally {
            if(rs != null){
                rs.close();
            }

            if(stmt != null){
                stmt.close();
            }

            if(conn != null){
                conn.close();
            }
        }
    }
}
