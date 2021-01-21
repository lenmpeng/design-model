package com.sise.策略模式.工厂策略.support;

/**
 * The type Gold strategy.
 *
 * @author lenm
 */
public class GoldStrategy implements Strategy {
    @Override
    public double compute(long money) {
        System.out.println("黄金会员 8折");
        return money * 0.8;
    }

    @Override
    public int getType() {
        return 3;
    }
}
