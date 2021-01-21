package com.sise.设计概述;
/**
 * @author lenm
 */
public class Vehicle {
    private String name;

    /**
     * Instantiates a new Vehicle.
     *
     * @param name the name
     */
    public Vehicle(String name) {
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
     * Go.
     */
    public void go() {
        Address address = new Address("东北");
        System.out.println("去往" + address.getAddressName());
    }

    /**
     * Go.
     *
     * @param address the address
     */
    public void go(Address address) {
        System.out.println("去往" + address.getAddressName());
    }

}
