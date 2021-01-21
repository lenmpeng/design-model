package com.sise.单例模式.加锁的懒汉式;

/**
 * 加了锁之后的懒汉式
 * <p>
 * 优点：线程安全 延迟创建
 * 缺点：容易出现排队堵塞，同步下效率低
 *
 * @author lenm
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
    public synchronized static SingleLetonClass getOne() {
        if (one == null) {
            one = new SingleLetonClass();
        }
        return one;
    }
}
