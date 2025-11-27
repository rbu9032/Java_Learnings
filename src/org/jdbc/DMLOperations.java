package org.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DMLOperations {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        //Step 1: Register the driver (optional)
       // Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("Driver Registered");
        //Step 2: Establishing a connection
        String url = "jdbc:mysql://localhost:3306/raghu";
        String username = "root";
        String password = "1218";

       Connection connection = DriverManager.getConnection(url, username, password);

       //Step 3: Create a statement
         Statement statement = connection.createStatement();
       //Step 4: Prepare the SQL query
         //String query = "insert into sample values(4,'Susi')";
         String query = "update sample set name = 'Sreenu' where id=2";
       //Step 5: Executing
         statement.executeUpdate(query);
       //Step 6:
        System.out.println("Executed query");

        String query1 = "delete from sample where id=4";
        statement.executeUpdate(query1);

    }
}
