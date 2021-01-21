package com.sise.工厂模式.抽象工程模式;

/**
 * The type Spicy strip factory.
 * @author lenm
 */
public class SpicyStripFactory implements SnackFactory {
    @Override
    public Snack createSnack() {
        SpicyStrip spicyStrip = new SpicyStrip();
        spicyStrip.setName("辣条");
        spicyStrip.setPrice(2.5);
        return spicyStrip;
    }
}
