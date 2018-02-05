/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas_besar.event;

import tugas_besar.entity.Iuran;
import tugas_besar.model.IuranModel;

/**
 *
 * @author yustitia arofa
 */
public interface IuranListener {

    public void onChange(IuranModel model);

    public void onInsert(Iuran iuran);

    public void onDelete();

    public void onUpdate(Iuran iuran);

}
