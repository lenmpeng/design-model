package com.sise.策略模式.工厂策略.support;

/**
 * The interface Strategy.
 * @author lenm
 */
public interface Strategy {
    /**
     * Compute double.
     *
     * @param money the money
     * @return double double
     */
    double compute(long money);

    /**
     * 返回 type
     *
     * @return the type
     */
    int getType();
}
