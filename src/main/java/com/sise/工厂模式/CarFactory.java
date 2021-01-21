package com.sise.工厂模式;

/**
 * @author lenm
 */
public class CarFactory implements VehicleFactory {

    @Override
    public Vehicle create() {
        System.out.println("创建car");
        return new Car();
    }
}
