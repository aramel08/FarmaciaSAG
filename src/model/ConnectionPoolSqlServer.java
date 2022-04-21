/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.SQLException;
import org.apache.commons.dbcp2.BasicDataSource;

/**
 *
 * @author arame
 */

public class ConnectionPoolSqlServer {
    
    private final String DB="FarmaciaSAG";
    private final String SERVER = "DESKTOP-6KK00BR";     
    private final String URL="jdbc:sqlserver://"+SERVER+":1433;database="+DB;
    private final String USER="sa";
    private final String PASS="1234";
    
    private static ConnectionPoolSqlServer dataSource;
    private BasicDataSource basicDataSource=null;
    
    private ConnectionPoolSqlServer(){
     
        basicDataSource = new BasicDataSource();
        basicDataSource.setDriverClassName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        basicDataSource.setUsername(USER);
        basicDataSource.setPassword(PASS);
        basicDataSource.setUrl(URL);
        
        basicDataSource.setMinIdle(5);
        basicDataSource.setMaxIdle(20);
        basicDataSource.setMaxTotal(50);
        basicDataSource.setMaxWaitMillis(-1);
        
    }
    
    public static ConnectionPoolSqlServer getInstance() {
        if (dataSource == null) {
            dataSource = new ConnectionPoolSqlServer();
            return dataSource;
        } else {
            return dataSource;
        }
    }

    public Connection getConnection() throws SQLException{
      return this.basicDataSource.getConnection();
    }
    
    public void closeConnection(Connection connection) throws SQLException {
        connection.close();
    }    
    
    
    




    
}
