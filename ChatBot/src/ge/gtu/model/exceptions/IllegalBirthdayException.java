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
public class IllegalBirthdayException extends Exception {

    /**
     * Creates a new instance of <code>IllegalDateException</code> without
     * detail message.
     */
    public IllegalBirthdayException() {
    }

    /**
     * Constructs an instance of <code>IllegalDateException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public IllegalBirthdayException(String msg) {
        super(msg);
    }
}
