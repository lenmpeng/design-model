package com.sise.工厂模式;

/**
 * @author lenm
 */
public class PlaneFactory implements VehicleFactory {

    /**
     * The Vehicle.
     */
    public Vehicle vehicle;

    @Override
    public Vehicle create() {
        System.out.println("创建飞机");
        vehicle = new Plane();
        return vehicle;
    }
}
