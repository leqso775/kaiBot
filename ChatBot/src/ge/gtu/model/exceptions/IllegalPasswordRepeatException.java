/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ge.gtu.model.exceptions;

/**
 *
 * @author Alex
 */
public class IllegalPasswordRepeatException extends Exception {

    /**
     * Creates a new instance of <code>IllegalPassWordRepeatException</code>
     * without detail message.
     */
    public IllegalPasswordRepeatException() {
    }

    /**
     * Constructs an instance of <code>IllegalPassWordRepeatException</code>
     * with the specified detail message.
     *
     * @param msg the detail message.
     */
    public IllegalPasswordRepeatException(String msg) {
        super(msg);
    }
}
