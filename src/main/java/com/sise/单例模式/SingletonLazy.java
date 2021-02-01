package com.sise.单例模式;

/**
 * The type Singleton lazy.
 *
 * @author lenm
 * @date 2021 /2/1 15:38
 */
public class SingletonLazy {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        President zt1 = President.getInstance();
        zt1.getName();    //输出总统的名字
        President zt2 = President.getInstance();
        zt2.getName();    //输出总统的名字
        if (zt1 == zt2) {
            System.out.println("他们是同一人！");
        } else {
            System.out.println("他们不是同一人！");
        }
    }
}

/**
 * The type President.
 */
class President {
    /**
     *  保证instance在所有线程中同步
     */
    private static volatile President instance = null;

    /**
     * private避免类在外部被实例化
     */
    private President() {
        System.out.println("产生一个总统！");
    }

    /**
     * Gets instance.
     *
     * @return the instance
     */
    public static synchronized President getInstance() {
        //在getInstance方法上加同步
        if (instance == null) {
            instance = new President();
        } else {
            System.out.println("已经有一个总统，不能产生新总统！");
        }
        return instance;
    }

    /**
     * Gets name.
     */
    public void getName() {
        System.out.println("我是美国总统：特朗普。");
    }
}