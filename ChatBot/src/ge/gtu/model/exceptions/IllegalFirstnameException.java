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
public class IllegalFirstnameException extends Exception {

    /**
     * Creates a new instance of <code>IllegalNameException</code> without
     * detail message.
     */
    public IllegalFirstnameException() {
    }

    /**
     * Constructs an instance of <code>IllegalNameException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public IllegalFirstnameException(String msg) {
        super(msg);
    }
}
