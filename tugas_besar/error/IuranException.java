/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas_besar.error;

/**
 *
 * @author yustitia arofa
 */
public class IuranException extends Exception {

    /**
     * Creates a new instance of <code>IuranException</code> without detail
     * message.
     */
    public IuranException() {
    }

    /**
     * Constructs an instance of <code>IuranException</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public IuranException(String msg) {
        super(msg);
    }
}
