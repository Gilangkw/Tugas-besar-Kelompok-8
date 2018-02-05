/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas_besar.model;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import tugas_besar.entity.Iuran;

/**
 *
 * @author yustitia arofa
 */
public class TabelIuranModel extends AbstractTableModel{
    
    private List<Iuran> list = new ArrayList<Iuran>();

    public void setList(List<Iuran> list) {
        this.list = list;
    }
    
    

    @Override
    public int getRowCount() {
        
        return list.size();
    }

    @Override
    public int getColumnCount() {
    return 8;
    }

    public boolean add(Iuran e) {
        try {
            return list.add(e);
        } finally {
            fireTableRowsInserted(getRowCount()-1, getColumnCount()-1);
        }
    }

    public Iuran get(int i) {
        return list.get(i);
    }

    public Iuran set(int i, Iuran e) {
        try {
             return list.set(i, e);
        } finally {
            fireTableRowsUpdated(i, i);
        }
    }

    public Iuran remove(int i) {
        try {
             return list.remove(i);
        } finally {
            fireTableRowsDeleted(i, i);
        }
    }
    
    

    @Override
    public String getColumnName(int column) {
        switch(column){
                case 0 :
                return "NO_KK";
                case 1 :
                return "NAMA_KK";
                case 2 :
                return "RT";
                case 3 :
                return "ALAMAT";
                case 4 :
                return "TANGGAL";
                case 5 :
                return "BULAN";
                case 6 :
                return "TAHUN";
                case 7 :
                return "STATUS";
                default:
                return  null;
            
        
        
        }
    }
    

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
    switch(columnIndex){
            case 0:
            return list.get(rowIndex).getNo_kk();
            case 1:
            return list.get(rowIndex).getNama_kk();
            case 2:
            return list.get(rowIndex).getRt();
            case 3:
            return list.get(rowIndex).getAlamat();
            case 4:
            return list.get(rowIndex).getTanggal();
            case 5:
            return list.get(rowIndex).getBulan();
            case 6:
            return list.get(rowIndex).getTahun();
            case 7:
            return list.get(rowIndex).getStatus();
            default:
                return  null;
    
    }
    }


    
}
