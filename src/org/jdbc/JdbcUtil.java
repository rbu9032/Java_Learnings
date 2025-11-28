package org.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcUtil {

    public Connection connection = null;
  public Connection getConnection() throws SQLException {
      //Step 2: Establishing a connection

      if(connection == null){
          connection = DriverManager.getConnection(Constants.URL, Constants.userName, Constants.password);
      }
      return connection;
  }

}
