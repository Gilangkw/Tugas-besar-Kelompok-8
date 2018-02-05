/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas_besar.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import tugas_besar.entity.Iuran;
import tugas_besar.error.IuranException;
import tugas_besar.service.IuranDao;

/**
 *
 * @author yustitia arofa
 */
public class IuranDaoImp implements IuranDao {

    public Connection connection;

    private final String InsertIuran = "INSERT INTO IURAN(NO_KK,NAMA_KK,RT,ALAMAT,TANGGAL,BULAN,TAHUN,STATUS)VALUES(?,?,?,?,?,?,?,?)";
    private  final String UpdateIuran ="UPDATE IURAN SET NAMA_KK=?,RT=?,ALAMAT=?,TANGGAL=?,BULAN=?,TAHUN=?,STATUS=? WHERE NO_KK=?";
    private  final String DeleteIuran ="DELETE FROM IURAN WHERE NO_KK=?";
    private final  String selectAll="SELECT*FROM IURAN";
    
    public IuranDaoImp(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void InsertIuran(Iuran iuran) throws IuranException {
        PreparedStatement statement = null;

        try {
            connection.setAutoCommit(false);
            
            statement = connection.prepareStatement(InsertIuran);

            statement.setString(1,iuran.getNo_kk());
            statement.setString(2,iuran.getNama_kk());
            statement.setString(3,iuran.getRt());
            statement.setString(4,iuran.getAlamat());
            statement.setString(5,iuran.getTanggal());
            statement.setString(6,iuran.getBulan());
            statement.setString(7,iuran.getTahun());
            statement.setString(8,iuran.getStatus());
            statement.executeUpdate();
            
            connection.commit();
            

        } catch (SQLException e) {
            try {
                connection.rollback();
            } catch (SQLException ex) {
            }
            
            throw new IuranException(e.getMessage());
        }finally{
            try {
                connection.setAutoCommit(true);
            } catch (SQLException ex) {
            }
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                }
                
            }
        
        
        }
    }

    @Override
    public void UpdateIuran(Iuran iuran) throws IuranException {
          PreparedStatement statement = null;

        try {
            connection.setAutoCommit(false);
            
            statement = connection.prepareStatement(UpdateIuran);

            statement.setString(1,iuran.getNo_kk());
            statement.setString(2,iuran.getNama_kk());
            statement.setString(3,iuran.getRt());
            statement.setString(4,iuran.getAlamat());
            statement.setString(5,iuran.getTanggal());
            statement.setString(6,iuran.getBulan());
            statement.setString(7,iuran.getTahun());
            statement.setString(8,iuran.getStatus());
            statement.executeUpdate();
            connection.commit();
            

        } catch (SQLException e) {
            
            throw new IuranException(e.getMessage());
        }finally{
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                }
                
            }
        
        
        }
        
    }

    @Override
    public void DeleteIuran(String no_kk) throws IuranException {
        PreparedStatement statement = null;

        try {
            connection.setAutoCommit(false);
            
            statement = connection.prepareStatement(DeleteIuran);

            statement.setString(1, no_kk );
            statement.executeUpdate();
            connection.commit();

        }catch (SQLException e) {
            try {
                connection.rollback();
            } catch (SQLException ex) {
            }
            
            throw new IuranException(e.getMessage());
        }finally{
            try {
                connection.setAutoCommit(true);
            } catch (SQLException ex) {
            }
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                }
                
            }
        
        
        }
    }

    @Override
    public List<Iuran> selectAllIuran() throws IuranException {
        Statement statement = null;
        List<Iuran> list = new ArrayList<Iuran>();
        
        try {
            connection.setAutoCommit(false);
            
            statement = connection.createStatement();
 
            
            ResultSet result = statement.executeQuery(selectAll);
            Iuran iuran = null;
            
            while (result.next()) {
             iuran = new Iuran();
             iuran.setNo_kk(result.getString("NO_KK"));
             iuran.setNama_kk(result.getString("NAMA_KK"));
             iuran.setRt(result.getString("RT"));
             iuran.setAlamat(result.getString("ALAMAT"));
             iuran.setTanggal(result.getString("TANGGAL"));
             iuran.setBulan(result.getString("BULAN"));
             iuran.setTahun(result.getString("TAHUN"));
             iuran.setStatus(result.getString("STATUS"));
             list.add(iuran);
            } 
            connection.commit();
            return list;
        } catch (SQLException e) {
            try {
                connection.rollback();
            } catch (SQLException ex) {
            }
            
            throw new IuranException(e.getMessage());
        }finally{
            try {
                connection.setAutoCommit(true);
            } catch (SQLException ex) {
            }
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                }
                
            }
        
        
        }
}

}
