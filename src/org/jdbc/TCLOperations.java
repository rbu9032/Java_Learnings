package org.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TCLOperations {

    public static void main(String[] args) throws SQLException {
        JdbcUtil jdbcUtil = new JdbcUtil();
        Connection connection = jdbcUtil.getConnection();
        connection.setAutoCommit(false);
        PreparedStatement preparedStatement = connection.prepareStatement("update sample set name = ? where id = ?");
        preparedStatement.setString(1,"Susmi");
        preparedStatement.setInt(2,4);
        preparedStatement.executeUpdate();
        System.out.println("Record updated");
        connection.commit();
    }
}
