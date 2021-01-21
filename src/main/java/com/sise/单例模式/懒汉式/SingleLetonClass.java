package com.sise.单例模式.懒汉式;

/**
 * 懒汉式单例模式(不加锁的模式)
 * <p>
 * 缺点：
 * 线程不安全
 * 延迟创建
 * @author lenm
 */
public class SingleLetonClass {
    private static SingleLetonClass one;

    private SingleLetonClass() {
    }

    /**
     * Gets one.
     *
     * @return the one
     */
    public static SingleLetonClass getOne() {
        if (one == null) {
            return one;
        } else {
            return one;
        }
    }
}
