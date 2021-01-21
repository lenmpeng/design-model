package com.sise.单例模式.枚举方式;

/**
 * The enum Singleton class.
 *
 * @author lenm
 */
public enum SingletonClass {
    /**
     * Instance singleton class.
     */
    INSTANCE;
    private Resource instance;

    SingletonClass() {
        instance = new Resource();
    }

    /**
     * Gets instance.
     *
     * @return the instance
     */
    public Resource getInstance() {
        return instance;
    }
}

/**
 * 描述：首先，在枚举中我们明确了构造方法限制为私有，在我们访问枚举实例时会执行构造方法，
 * 同时每个枚举实例都是static final类型的，也就表明只能被实例化一次。在调用构造方法时，我们的单例被实例化。
 * <p>
 * <p>
 * 枚举方式：
 * 具有所有的优点（也可以预防线程安全性的问题）
 */
class Resource {
}


