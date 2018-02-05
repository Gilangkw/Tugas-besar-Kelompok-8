/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas_besar.service;

import java.util.List;
import tugas_besar.entity.Iuran;
import tugas_besar.error.IuranException;

/**
 *
 * @author yustitia arofa
 */
public interface IuranDao {
    public void InsertIuran(Iuran iuran)throws IuranException;
    public void UpdateIuran(Iuran iuran)throws IuranException;
    public void DeleteIuran(String no_kk)throws IuranException;
    public List<Iuran> selectAllIuran() throws IuranException;
}
