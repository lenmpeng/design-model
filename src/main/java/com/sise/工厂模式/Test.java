package com.sise.工厂模式;

/**
 * @author lenm
 */
public class Test {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        VehicleFactory v1 = new PlaneFactory();
        VehicleFactory v2 = new CarFactory();
        v1.create();
        v2.create();
    }
}
