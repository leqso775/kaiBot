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
public class IllegalPasswordException1 extends Exception {

    /**
     * Creates a new instance of <code>IllegalPasswordException</code> without
     * detail message.
     */
    public IllegalPasswordException1() {
    }

    /**
     * Constructs an instance of <code>IllegalPasswordException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public IllegalPasswordException1(String msg) {
        super(msg);
    }
}
