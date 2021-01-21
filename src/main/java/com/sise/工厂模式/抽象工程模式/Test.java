package com.sise.工厂模式.抽象工程模式;

/**
 * The type Test.
 * @author lenm
 */
public class Test {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        SnackFactory eatSnackFactory = new EatSnackFactory();
        SnackFactory drinkFactory = new DrinkSnackFactory();
        EatSnack es = (EatSnack) eatSnackFactory.createSnack();
        System.out.println(es.toString());
        DrinkSnack ds = (DrinkSnack) drinkFactory.createSnack();
        System.out.println(ds.toString());
    }
}
