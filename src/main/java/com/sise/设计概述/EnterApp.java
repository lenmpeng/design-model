package com.sise.设计概述;

/**
 * @author lenm
 */
public class EnterApp {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        Driver driver = new Driver("老张");
        driver.drive(new Car("汽车"), new Address("北京"));
    }
}
