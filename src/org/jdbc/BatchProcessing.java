package org.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BatchProcessing {
    public static void main(String[] args) throws SQLException {
        JdbcUtil jdbcUtil = new JdbcUtil();
        Connection connection = jdbcUtil.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement("Insert into sample values(?,?)");
        preparedStatement.setInt(1,5);
        preparedStatement.setString(2,"Bahadur");
        preparedStatement.addBatch();
        preparedStatement.setInt(1,6);
        preparedStatement.setString(2,"Ravi");
        preparedStatement.addBatch();
        preparedStatement.executeBatch();
        System.out.println("Batch executed");
    }
}
