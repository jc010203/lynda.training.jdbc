package com.lynda.training;

import java.sql.*;

public class Main {

    private static final String SQL = "select * from states";

    public static void main(String[] args) {
	// write your code here

        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            conn = DBUtil.getConnection(DBType.MYSLQ);
            System.out.println("connected!");

            stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            rs = stmt.executeQuery(SQL);
            rs.last();


            System.out.println("number of rows: " + rs.getRow());


        } catch(SQLException e){
            DBUtil.processexception(e);
        }
    }
}
