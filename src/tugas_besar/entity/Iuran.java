/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas_besar.entity;

import java.util.Objects;

/**
 *
 * @author yustitia arofa
 */
public class Iuran {
    
    private String no_kk;
    private String nama_kk;
    private String rt;
    private String alamat;
    private String tanggal;
    private String bulan;
    private String tahun;
    private String status;
    
    public Iuran(){
    
    
    }

    public Iuran(String no_kk, String nama_kk, String rt, String alamat, String tanggal, String bulan, String tahun, String status) {
        this.no_kk = no_kk;
        this.nama_kk = nama_kk;
        this.rt = rt;
        this.alamat = alamat;
        this.tanggal = tanggal;
        this.bulan = bulan;
        this.tahun = tahun;
        this.status = status;
    }
    

    public String getNo_kk() {
        return no_kk;
    }

    public void setNo_kk(String no_kk) {
        this.no_kk = no_kk;
    }

    public String getNama_kk() {
        return nama_kk;
    }

    public void setNama_kk(String nama_kk) {
        this.nama_kk = nama_kk;
    }

    public String getRt() {
        return rt;
    }

    public void setRt(String rt) {
        this.rt = rt;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public String getBulan() {
        return bulan;
    }

    public void setBulan(String bulan) {
        this.bulan = bulan;
    }

    public String getTahun() {
        return tahun;
    }

    public void setTahun(String tahun) {
        this.tahun = tahun;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 11 * hash + Objects.hashCode(this.no_kk);
        hash = 11 * hash + Objects.hashCode(this.nama_kk);
        hash = 11 * hash + Objects.hashCode(this.rt);
        hash = 11 * hash + Objects.hashCode(this.alamat);
        hash = 11 * hash + Objects.hashCode(this.tanggal);
        hash = 11 * hash + Objects.hashCode(this.bulan);
        hash = 11 * hash + Objects.hashCode(this.tahun);
        hash = 11 * hash + Objects.hashCode(this.status);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Iuran other = (Iuran) obj;
        if (!Objects.equals(this.no_kk, other.no_kk)) {
            return false;
        }
        if (!Objects.equals(this.nama_kk, other.nama_kk)) {
            return false;
        }
        if (!Objects.equals(this.rt, other.rt)) {
            return false;
        }
        if (!Objects.equals(this.alamat, other.alamat)) {
            return false;
        }
        if (!Objects.equals(this.tanggal, other.tanggal)) {
            return false;
        }
        if (!Objects.equals(this.bulan, other.bulan)) {
            return false;
        }
        if (!Objects.equals(this.tahun, other.tahun)) {
            return false;
        }
        if (!Objects.equals(this.status, other.status)) {
            return false;
        }
        return true;
    }
    

}