/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas_besar.controller;

import javax.swing.JOptionPane;
import tugas_besar.model.IuranModel;
import tugas_besar.view.IuranView;

/**
 *
 * @author yustitia arofa
 */
public class IuranController {

    private IuranModel model;

    public void setModel(IuranModel model) {
        this.model = model;
    }

    public void resetIuran(IuranView view) {
        model.resetIuran();

    }

    public void InsetIuran(IuranView view) {

        String no_kk = view.getTxtnoKK().getText();
        String nama_kk = view.getTxtnamaKK().getText();
        String rt = view.getTxtRT().getText();
        String alamat = view.getTxtAlamat().getText();
        String tanggal = view.getTxttgl().getText();
        String bulan = view.getBlnBox().getSelectedItem().toString();
        String tahun = view.getTxttahun().getText();
        String status = view.getStatusBox().getSelectedItem().toString();

        if (nama_kk.trim().equals("")) {
            JOptionPane.showMessageDialog(view, "Nama Masih Kosong");
        } else if (nama_kk.length() > 255) {
            JOptionPane.showMessageDialog(view, "Nama Depan tak boleh lebih dari 255");
        } else if (bulan.length() > 12) {
            JOptionPane.showMessageDialog(view, "Number telepon tak boleh lebih dari 12 digit");

        } else {

            model.setNo_kk(no_kk);
            model.setNama_kk(nama_kk);
            model.setRt(rt);
            model.setAlamat(alamat);
            model.setTanggal(tanggal);
            model.setBulan(bulan);
            model.setTahun(tahun);
            model.setStatus(status);

            try {
                model.insertIuran();
                JOptionPane.showMessageDialog(view, "Data Berhasil Ditambahkan");
                model.resetIuran();
            } catch (Throwable throwable) {
                JOptionPane.showMessageDialog(view, new Object[]{
                    "Terjadi error di database dengan pesan ", throwable.getMessage()
                });
            }

        }
    }

    public void UpdateIuran(IuranView view) {

        if (view.getTabelIuran().getSelectedRowCount() == 0) {
            JOptionPane.showMessageDialog(view, "Silahkan Seleksi baris data yang akan diubah");
            return;
        }

        String no_kk = view.getTxtnoKK().getText();
        String nama_kk = view.getTxtnamaKK().getText();
        String rt = view.getTxtRT().getText();
        String alamat = view.getTxtAlamat().getText();
        String tanggal = view.getTxttgl().getText();
        String bulan = view.getBlnBox().getSelectedItem().toString();
        String tahun = view.getTxttahun().getText();
        String status = view.getStatusBox().getSelectedItem().toString();

        if (nama_kk.trim().equals("")) {
            JOptionPane.showMessageDialog(view, "Nama Masih Kosong");
        } else if (nama_kk.length() > 255) {
            JOptionPane.showMessageDialog(view, "Nama Depan tak boleh lebih dari 255");
        } else if (bulan.length() > 12) {
            JOptionPane.showMessageDialog(view, "Number telepon tak boleh lebih dari 12 digit");

        } else {

            model.setNo_kk(no_kk);
            model.setNama_kk(nama_kk);
            model.setRt(rt);
            model.setAlamat(alamat);
            model.setTanggal(tanggal);
            model.setBulan(bulan);
            model.setTahun(tahun);
            model.setStatus(status);

            try {
                model.updateIuran();
                JOptionPane.showMessageDialog(view, "Data Berhasil Ditambahkan");
                model.resetIuran();
            } catch (Throwable throwable) {
                JOptionPane.showMessageDialog(view, new Object[]{
                    "Terjadi error di database dengan pesan ", throwable.getMessage()
                });
            }
        }
    }

    public void DeleteIuran(IuranView view) {

        if (view.getTabelIuran().getSelectedRowCount() == 0) {
            JOptionPane.showMessageDialog(view, "Silahkan Seleksi baris data yang akan diubah");
            return;
        }
        if (JOptionPane.showConfirmDialog(view, "Anda yakin akan menghapus?")
                == JOptionPane.OK_OPTION) {

            String no_kk = view.getTxtnoKK().getText();
            model.setNo_kk(no_kk);

            try {
                model.deleteIuran();
                JOptionPane.showMessageDialog(view, "Data Pelanggan Berhasil Di Hapus");
                model.resetIuran();
            } catch (Throwable throwable) {
                JOptionPane.showMessageDialog(view, new Object[]{
                    "Terjadi error di database dengan pesan ", throwable.getMessage()
                });
            }
        }

    }
    
}
