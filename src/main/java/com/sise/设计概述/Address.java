package com.sise.设计概述;

/**
 * @author lenm
 */
public class Address {
    private String addressName;

    /**
     * Instantiates a new Address.
     */
    public Address() {
    }

    /**
     * Instantiates a new Address.
     *
     * @param addressName the address name
     */
    public Address(String addressName) {
        this.addressName = addressName;
    }

    /**
     * Gets address name.
     *
     * @return the address name
     */
    public String getAddressName() {
        return addressName;
    }

    /**
     * Sets address name.
     *
     * @param addressName the address name
     */
    public void setAddressName(String addressName) {
        this.addressName = addressName;
    }
}
