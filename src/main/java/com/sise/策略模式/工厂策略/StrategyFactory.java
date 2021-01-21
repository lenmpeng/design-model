package com.sise.策略模式.工厂策略;

import com.sise.策略模式.工厂策略.support.GoldStrategy;
import com.sise.策略模式.工厂策略.support.OrdinaryStrategy;
import com.sise.策略模式.工厂策略.support.PlatinumStrategy;
import com.sise.策略模式.工厂策略.support.SilverStrategy;
import com.sise.策略模式.工厂策略.support.Strategy;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * The type Strategy factory.
 *
 * @author lenm
 */
public class StrategyFactory {
    /**
     * Gets result.
     *
     * @param money the money
     * @param type  the type
     * @return the result
     */
    public static double getResult(long money, int type) {

        if (money < 1000) {
            return money;
        }

        Strategy strategy = StrategyFactory.getInstance().get(type);

        if (strategy == null) {
            throw new IllegalArgumentException("please input right type");
        }

        return strategy.compute(money);
    }

    private Map<Integer, Strategy> map;

    /**
     * Instantiates a new Strategy factory.
     */
    public StrategyFactory() {
        List<Strategy> strategies = new ArrayList<>();
        strategies.add(new OrdinaryStrategy());
        strategies.add(new SilverStrategy());
        strategies.add(new GoldStrategy());
        strategies.add(new PlatinumStrategy());
        // 看这里 看这里 看这里！
        map = strategies.stream().collect(Collectors.toMap(Strategy::getType, strategy -> strategy));

        /* 等同上面
        map = new HashMap<>();
        for (Strategy strategy : strategies) {
            map.put(strategy.getType(), strategy);
        }*/
    }

    /**
     * The type Holder.
     */
    public static class Holder {
        /**
         * The constant instance.
         */
        public static StrategyFactory instance = new StrategyFactory();
    }

    /**
     * Gets instance.
     *
     * @return the instance
     */
    public static StrategyFactory getInstance() {
        return Holder.instance;
    }

    /**
     * Get strategy.
     *
     * @param type the type
     * @return the strategy
     */
    public Strategy get(Integer type) {
        return map.get(type);
    }
}
