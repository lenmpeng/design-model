package com.sise.策略模式.工厂策略.support;

/**
 * The type Ordinary strategy.
 *
 * @author lenm
 */
public class OrdinaryStrategy implements Strategy {
    @Override
    public double compute(long money) {
        System.out.println("普通会员 不打折");
        return money;
    }
    @Override
    public int getType() {
        return 2;
    }
}

