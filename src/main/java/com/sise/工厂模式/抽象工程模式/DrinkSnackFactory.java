package com.sise.工厂模式.抽象工程模式;

/**
 * @author lenm
 */
public class DrinkSnackFactory implements SnackFactory {
    @Override
    public DrinkSnack createSnack() {
        DrinkSnack ds = new DrinkSnack();
        ds.setName("可乐");
        ds.setPrice(166);
        return ds;
    }
}
