package com.company.mysql.jdbc;

import java.sql.*;

/**
 * Created by fns02 on 5/30/2016.
 */
public class JdbcInsertDemo {
    public static void main(String[] args) throws SQLException {
        Connection myConn = null;
        Statement myStmt = null;
        ResultSet myRs = null;

        try

        {
            // 1. Get a connection to database
            myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "student", "student");

            System.out.println("Database connection successful!\n");

            // 2. Create a statement
            myStmt = myConn.createStatement();

            System.out.println("Inserting new emploee to database");

            int rowsEffected = myStmt.executeUpdate("INSERT INTO employees" +
                    "(last_name, first_name, email, department, salary)" +
                    "VALUES " +
                    "('Wright' , 'Eric' , 'erc.wright@foo.com' , 'HR', '3300')");

            myRs = myStmt.executeQuery("SELECT * FROM employees ORDER BY last_name");

            while (myRs.next()) {
                System.out.println(myRs.getString("last_name") + ", " + myRs.getString("first_name"));
            }
        } catch (
                Exception exc
                )

        {
            exc.printStackTrace();
        } finally

        {
            if (myRs != null) {
                myRs.close();
            }

            if (myStmt != null) {
                myStmt.close();
            }

            if (myConn != null) {
                myConn.close();
            }
        }

    }
}
