package com.sise.单例模式.加了锁和双重验证的懒汉式;

/**
 * 优点：同步复杂情况得以优化 线程安全 延迟创建
 * 缺点： 实现比较复杂
 */

public class SingleLetonClass {
    /**
     * 唯一的一个私有属性，通过外界的函数来调用
     */
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
            synchronized (SingleLetonClass.class) {
                if (one == null) {
                    one = new SingleLetonClass();
                }
            }
        }
        return one;
    }
}
