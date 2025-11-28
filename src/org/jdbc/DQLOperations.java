package org.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class DQLOperations {

    public static void main(String[] args) {
        try{
            JdbcUtil jdbcUtil = new JdbcUtil();
            Connection connection = jdbcUtil.getConnection();
            String query = "select * from sample";
            PreparedStatement statement = connection.prepareStatement(query);
            ResultSet rs = statement.executeQuery();
            System.out.println("Id\tName");
            while(rs.next()){
                int id = rs.getInt("id");
                String name = rs.getString("name");
                System.out.println(id+"\t"+name);
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
