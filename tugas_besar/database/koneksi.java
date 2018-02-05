/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas_besar.database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author yustitia arofa
 */
public class koneksi {
    private static Connection koneksi;
    public static Connection getKoneksi(){
        if (koneksi==null) {
            try {
                String url;
                url = "jdbc:mysql://localhost:3306/iuranwarga";
                DriverManager.registerDriver(new com.mysql.jdbc.Driver() );
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            }
            
        }return koneksi;
    
    }static Object getConnection(){
    throw new UnsupportedOperationException("not yet implemed");
    
    }
    
}
