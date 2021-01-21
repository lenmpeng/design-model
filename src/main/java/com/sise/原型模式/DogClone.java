package com.sise.原型模式;

/**
 *
 */
public class DogClone implements Cloneable {

    /**
     * The Dog.
     */
    public Dog dog = new Dog(4);
    /**
     * 腿的条数
     */
    public int legCount;


    @Override
    public Object clone() throws CloneNotSupportedException {
        DogClone obj = null;
        try {
            obj = (DogClone) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        obj.dog = (Dog) dog.clone();
        //克隆对应的这个类
        return obj;
    }

}
