package com.sise.策略模式.工厂策略.support;

/**
 * The type Platinum strategy.
 *
 * @author lenm
 */
public class PlatinumStrategy implements Strategy {
    @Override
    public double compute(long money) {
        System.out.println("白金会员 优惠50元，再打7折");
        return (money - 50) * 0.7;
    }

    @Override
    public int getType() {
        return 4;
    }
}
