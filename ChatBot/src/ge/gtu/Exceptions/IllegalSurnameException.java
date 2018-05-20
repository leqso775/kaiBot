/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ge.gtu.Exceptions;

/**
 *
 * @author Alex
 */
public class IllegalSurnameException extends Exception {

    /**
     * Creates a new instance of <code>IllegalSurnameException</code> without
     * detail message.
     */
    public IllegalSurnameException() {
    }

    /**
     * Constructs an instance of <code>IllegalSurnameException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public IllegalSurnameException(String msg) {
        super(msg);
    }
}
