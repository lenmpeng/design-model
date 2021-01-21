package com.sise.策略模式.工厂策略.support;

/**
 * The type Silver strategy.
 *
 * @author lenm
 */
public class SilverStrategy implements Strategy {
    @Override
    public double compute(long money) {
        System.out.println("白银会员 优惠50元");
        return money - 50;
    }

    @Override
    public int getType() {
        return 1;
    }
}