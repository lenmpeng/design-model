package com.sise.设计概述;

/**
 * @author lenm
 */
public class Driver {
    /**
     * 司机的名字
     */
    private String name;

    /**
     * Instantiates a new Driver.
     *
     * @param name the name
     */
    public Driver(String name) {
        this.name = name;
    }

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 设定可以开车去往东北（默认的地方）
     *
     * @param vehicle the vehicle
     */
    public void drive(Vehicle vehicle) {
        System.out.println(this.getName() + "驾驶" + vehicle.getName());
        vehicle.go();
    }

    /**
     * 设定可以开车去往某个地方
     *
     * @param vehicle the vehicle
     * @param address the address
     */
    public void drive(Vehicle vehicle, Address address) {
        System.out.println(this.getName() + "驾驶" + vehicle.getName());
        vehicle.go(address);
    }

}
