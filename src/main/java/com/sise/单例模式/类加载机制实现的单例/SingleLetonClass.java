package com.sise.单例模式.类加载机制实现的单例;

/**
 * 使用类加载机制实现的单例
 * @author lenm
 */
public class SingleLetonClass {
    private SingleLetonClass() {
    }

    /**
     * Gets instance.
     *
     * @return the instance
     */
    public static SingleLetonClass getInstance() {
        return OnlyInstanceHolder.ONLY;
    }

    /**
     * 静态内部类，用于持有唯一的SingleLetonClass
     */
    private static class OnlyInstanceHolder {
        static private SingleLetonClass ONLY = new SingleLetonClass();
    }

}
