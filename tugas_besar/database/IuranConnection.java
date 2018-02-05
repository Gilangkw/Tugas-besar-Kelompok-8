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
public class IuranConnection {

    Connection konek;

    public Connection getConnection(){
        try {
            
            konek = DriverManager.getConnection("jdbc:mysql://localhost:3306/iuranwarga", "root", "");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Data Gagal ditampilkan hubungi admin","INFOMASI", JOptionPane.INFORMATION_MESSAGE);
        }
        return konek;
    }

    
 
    
 
}

 