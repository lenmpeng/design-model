package com.sise.观察者模式.model;

/**
 * The type Msg obj.
 *
 * @author lenm
 */
public class MsgObj {
    /**
     * The Msg.
     */
    String msg;

    /**
     * Instantiates a new Msg obj.
     *
     * @param msg the msg
     */
    public MsgObj(String msg) {
        this.msg = msg;
    }

    /**
     * Print.
     */
    public void print() {
        System.out.println("========" + msg + "=======");
    }
}
