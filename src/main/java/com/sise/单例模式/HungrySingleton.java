package com.sise.单例模式;

/**
 * @author lenm
 * @date 2021/2/1 15:37
 */
public class HungrySingleton {
    private static final HungrySingleton instance = new HungrySingleton();

    private HungrySingleton() {
    }

    public static HungrySingleton getInstance() {
        return instance;
    }
}