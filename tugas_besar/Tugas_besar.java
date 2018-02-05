/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas_besar;

import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingUtilities;
import tugas_besar.database.IuranDatabase;
import tugas_besar.entity.Iuran;
import tugas_besar.error.IuranException;
import tugas_besar.service.IuranDao;
import tugas_besar.view.mainViewIuran;

/**
 *
 * @author yustitia arofa
 */
public class Tugas_besar {

    /**
     * @param args the command line arguments
     * @throws java.sql.SQLException
     * @throws tugas_besar.error.IuranException
     */
    public static void main(String[] args) throws SQLException, IuranException {
        // TODO code application logic here
        
        
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    mainViewIuran iuran = new mainViewIuran();
                     iuran.LoadDatabase();
                     iuran.setVisible(true);
                } catch (SQLException ex) {
                } catch (IuranException ex) {
                    Logger.getLogger(Tugas_besar.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    
    
}
