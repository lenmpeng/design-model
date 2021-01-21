package com.sise.观察者模式;

import com.sise.观察者模式.listener.UpdateListener;

/**
 * The type Test.
 *
 * @author lenm
 */
public class Test {


    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        ApplicationListener applicationListener = new UpdateListener();
        Member member = new Member("idea∂");
        member.degrade(applicationListener);
        member.upgrade(applicationListener);
    }
}
