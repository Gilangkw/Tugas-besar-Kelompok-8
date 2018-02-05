/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas_besar.database;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;


/**
 *
 * @author yustitia arofa
 */
public class IuranDatabase {
    private static Connection connection;
    
    
    public static Connection getConnection()throws SQLException{
        
        if (connection == null) {
            
            MysqlDataSource data = new MysqlDataSource();
            data.setURL("jdbc:mysql://localhost:3306/iuranwarga");
            data.setUser("root");
            data.setPassword("");
            connection = data.getConnection();
            
        }
        
      return connection;
    } 
   
    
}
