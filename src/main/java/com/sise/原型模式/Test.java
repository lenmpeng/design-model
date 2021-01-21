package com.sise.原型模式;

/**
 */
public class Test {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        DogClone dogClone = new DogClone();
        dogClone.legCount = 4;
        System.out.println("dogclone's leg:" + dogClone.legCount);
        System.out.println("dogclone's leg" + dogClone.dog.leg);
    }
}
