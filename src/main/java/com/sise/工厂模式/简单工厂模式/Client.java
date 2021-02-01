package com.sise.工厂模式.简单工厂模式;

/**
 * @author lenm
 * @date 2021/2/1 16:36
 */
public class Client {
    public static void main(String[] args) {
        Product product = SimpleFactory.makeProduct(0);
        product.show();
        Product product1 = SimpleFactory.makeProduct(1);
        product1.show();
        Product product2 = SimpleFactory.makeProduct(2);
        product2.show();
    }

    /**
     * 抽象产品`
     */
    public interface Product {
        void show();
    }

    /**
     * 具体产品：ProductA
     */
    static class ConcreteProduct1 implements Product {
        @Override
        public void show() {
            System.out.println("具体产品1显示...");
        }
    }

    /**
     * 具体产品：ProductB
     */
    static class ConcreteProduct2 implements Product {
        @Override
        public void show() {
            System.out.println("具体产品2显示...");
        }
    }

    final class Const {
        static final int PRODUCT_A = 0;
        static final int PRODUCT_B = 1;
        static final int PRODUCT_C = 2;
    }

    static class SimpleFactory {
        public static Product makeProduct(int kind) {
            switch (kind) {
                case Const.PRODUCT_A:
                    return new ConcreteProduct1();
                case Const.PRODUCT_B:
                    return new ConcreteProduct2();
            }
            return null;
        }
    }
}