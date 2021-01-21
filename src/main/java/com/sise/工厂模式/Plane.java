package com.sise.工厂模式;

/**
 * @author lenm
 */
public class Plane implements Vehicle {
    /**
     * The Name.
     */
    public String name;

    /**
     * Instantiates a new Plane.
     */
    public Plane() {
    }

    /**
     * Instantiates a new Plane.
     *
     * @param name the name
     */
    public Plane(String name) {
        this.name = name;
    }
}
