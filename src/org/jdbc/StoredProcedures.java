package org.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StoredProcedures {
    public static void main(String[] args) throws SQLException {
        JdbcUtil jdbcUtil = new JdbcUtil();
        Connection connection = jdbcUtil.getConnection();
        CallableStatement callableStatement = connection.prepareCall("{CALL SampleUsers()}");
        ResultSet resultSet = callableStatement.executeQuery();
        while (resultSet.next()){
            System.out.println(resultSet.getInt(1)+"\t"+resultSet.getString(2));
        }
    }
}
