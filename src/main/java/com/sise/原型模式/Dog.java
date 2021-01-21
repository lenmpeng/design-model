package com.sise.原型模式;

/**
 *
 * @author lenm
 */
public class Dog implements Cloneable {
    /**
     * The Leg.
     */
    public int leg;

    /**
     * Instantiates a new Dog.
     */
    public Dog() {
    }


    /**
     * Instantiates a new Dog.
     *
     * @param leg the leg
     */
    public Dog(int leg) {
        this.leg = leg;
    }

    @Override
    public String toString() {
        return "这条狗有" + leg + "条腿";
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
