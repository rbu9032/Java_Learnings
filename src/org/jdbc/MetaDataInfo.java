package org.jdbc;

import java.sql.*;

public class MetaDataInfo {

    public static void main(String[] args) throws SQLException {
        JdbcUtil jdbcUtil = new JdbcUtil();
        Connection connection = jdbcUtil.getConnection();
        String query = "select * from sample";
        PreparedStatement statement = connection.prepareStatement(query);
        ResultSet resultSet = statement.executeQuery();
        ResultSetMetaData metaData = resultSet.getMetaData();
    /*    while(resultSet.next()){
            System.out.println(resultSet.getInt("Id")+"\t"+resultSet.getString("name"));
        }*/
        System.out.println("Column count: "+metaData.getColumnCount());
        System.out.println("Table name: "+metaData.getTableName(1));
        System.out.println("Column Type: "+metaData.getColumnTypeName(1));


    }
}
