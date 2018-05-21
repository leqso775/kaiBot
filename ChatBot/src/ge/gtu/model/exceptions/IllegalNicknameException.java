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
public class IllegalNicknameException extends Exception {

    /**
     * Creates a new instance of <code>IllegalSurnameException</code> without
     * detail message.
     */
    public IllegalNicknameException() {
    }

    /**
     * Constructs an instance of <code>IllegalSurnameException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public IllegalNicknameException(String msg) {
        super(msg);
    }
}
