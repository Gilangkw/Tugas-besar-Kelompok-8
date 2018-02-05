/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas_besar.model;

import java.sql.SQLException;
import tugas_besar.database.IuranDatabase;
import tugas_besar.entity.Iuran;
import tugas_besar.error.IuranException;
import tugas_besar.event.IuranListener;
import tugas_besar.service.IuranDao;

/**
 *
 * @author yustitia arofa
 */
public class IuranModel {

    private String no_kk;
    private String nama_kk;
    private String rt;
    private String alamat;
    private String tanggal;
    private String bulan;
    private String tahun;
    private String status;

    private IuranListener listener;

    public IuranListener getListener() {
        return listener;
    }

    public void setListener(IuranListener listener) {
        this.listener = listener;
        
        fireOnChange();
    }

    public String getNo_kk() {
        return no_kk;
    }

    public void setNo_kk(String no_kk) {
        this.no_kk = no_kk;
        fireOnChange();
    }

    public String getNama_kk() {
        return nama_kk;
        
    }

    public void setNama_kk(String nama_kk) {
        this.nama_kk = nama_kk;
        fireOnChange();
    }

    public String getRt() {
        return rt;
    }

    public void setRt(String rt) {
        this.rt = rt;
        fireOnChange();
    }

    public String getAlamat() {
        return alamat;
        
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
        fireOnChange();
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
        fireOnChange();
    }

    public String getBulan() {
        return bulan;
    }

    public void setBulan(String bulan) {
        this.bulan = bulan;
        fireOnChange();
    }

    public String getTahun() {
        return tahun;
        
    }

    public void setTahun(String tahun) {
        this.tahun = tahun;
        fireOnChange();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
        fireOnChange();
    }

    protected void fireOnChange() {

        if (listener != null) {
            listener.onChange(this);

        }

    }

    protected void fireOnInsert(Iuran iuran) {
        if (listener != null) {
            listener.onInsert(iuran);

        }

    }

    protected void fireOnUpdate(Iuran iuran) {
        if (listener != null) {
            listener.onUpdate(iuran);

        }

    }

    protected void fireOnDelete() {
        if (listener != null) {
            listener.onDelete();

        }
    }

    public void insertIuran() throws SQLException, IuranException {
        IuranDao dao = IuranDatabase.getIuranDao();
        Iuran iuran = new Iuran();
        iuran.setNo_kk(no_kk);
        iuran.setNama_kk(nama_kk);
        iuran.setRt(rt);
        iuran.setAlamat(alamat);
        iuran.setTanggal(tanggal);
        iuran.setBulan(bulan);
        iuran.setTahun(tahun);
        iuran.setStatus(status);
        dao.InsertIuran(iuran);
        fireOnInsert(iuran);

    }

    public void updateIuran() throws SQLException, IuranException {
        IuranDao dao = IuranDatabase.getIuranDao();
        Iuran iuran = new Iuran();
        iuran.setNo_kk(no_kk);
        iuran.setNama_kk(nama_kk);
        iuran.setRt(rt);
        iuran.setAlamat(alamat);
        iuran.setTanggal(tanggal);
        iuran.setBulan(bulan);
        iuran.setTahun(tahun);
        iuran.setStatus(status);
        dao.UpdateIuran(iuran);
        fireOnUpdate(iuran);

    }

    public void deleteIuran() throws SQLException, IuranException {
        IuranDao dao = IuranDatabase.getIuranDao();
        dao.DeleteIuran(no_kk);
        fireOnDelete();

    }

    public void resetIuran() {
        setNo_kk("");
        setNama_kk("");
        setRt("");
        setAlamat("");
        setTanggal("");
        setBulan("");
        setTahun("");
        setStatus("");

    }

}
