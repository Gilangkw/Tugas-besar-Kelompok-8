/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas_besar;

import java.sql.SQLException;
import javax.swing.SwingUtilities;
import tugas_besar.error.IuranException;
import tugas_besar.view.mainWargaView;
import tugas_besar.view.mainloginView;

/**
 *
 * @author yustitia arofa
 */
public class Warga {
    public static void main(String[] args) throws SQLException, IuranException {
        // TODO code application logic here
        
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                mainWargaView iuran = new mainWargaView();
                iuran.setVisible(true); 
                
            }
        });
    }
    
}
