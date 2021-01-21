package com.sise.工厂模式.抽象工程模式;

/**
 * The type Eat snack factory.
 *
 * @author lenm
 */
public class EatSnackFactory implements SnackFactory {
    @Override
    public EatSnack createSnack() {
        EatSnack es = new EatSnack();
        es.setName("薯片");
        es.setPrice(66.5);
        return es;
    }
}
