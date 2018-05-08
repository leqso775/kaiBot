/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ge.gtu.model.exceptions;

/**
 *
 * @author sg
 */
public class IllegalEmailException extends Exception {

    /**
     * Creates a new instance of <code>IllegalSurnameException</code> without
     * detail message.
     */
    public IllegalEmailException() {
    }

    /**
     * Constructs an instance of <code>IllegalSurnameException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public IllegalEmailException(String msg) {
        super(msg);
    }
}
