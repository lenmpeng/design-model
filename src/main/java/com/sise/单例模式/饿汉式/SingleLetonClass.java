package com.sise.单例模式.饿汉式;

/**
 * 饿汉式单例模式
 *
 * 饿汉式单例模式(创建类的时候就开始加载，而且线程安全)
 * @author lenm
 */
public class SingleLetonClass {
    /**
     * 唯一一个实例对象，但是这样子的维护性不是太好，所以还是需要设置为私有的，然后通过一个函数来引用
     */
    private static SingleLetonClass one = new SingleLetonClass();

    private SingleLetonClass() {
    }

    /**
     * Gets single leton class.
     *
     * @return the single leton class
     */
    public static SingleLetonClass getSingleLetonClass() {
        return one;
    }

}
