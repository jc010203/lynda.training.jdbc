package com.lynda.training;

import java.sql.*;

public class Main {

    private static final String SQL = "select * from states";

    public static void main(String[] args) {


        try(
                Connection conn = DBUtil.getConnection(DBType.MYSLQ);
                Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
                ResultSet rs = stmt.executeQuery(SQL);
                )
        {

            System.out.println("connected!");


            rs.last();


            System.out.println("number of rows: " + rs.getRow());


        } catch(SQLException e){
            DBUtil.processexception(e);
        }
    }
}
