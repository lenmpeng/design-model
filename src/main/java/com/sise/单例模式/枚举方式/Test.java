package com.sise.单例模式.枚举方式;

/**
 * 使用枚举方式来调用单例
 * @author lenm
 */
public class Test {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        Resource re = new Resource();
        SingletonClass s1 = SingletonClass.INSTANCE;
        re = s1.getInstance();
    }
}
