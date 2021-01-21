package com.sise.工厂模式.抽象工程模式;

/**
 * The type Snack.
 * @author lenm
 */
public abstract class Snack {
    /**
     * The Name.
     */
    public String name;
    /**
     * The Price.
     */
    public double price;

    /**
     * Instantiates a new Snack.
     */
    public Snack() {
    }

    /**
     * Instantiates a new Snack.
     *
     * @param name  the name
     * @param price the price
     */
    public Snack(String name, double price) {
        this.name = name;
        this.price = price;
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
     * Gets price.
     *
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * Sets price.
     *
     * @param price the price
     */
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Snack{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
