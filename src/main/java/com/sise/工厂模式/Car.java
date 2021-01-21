package com.sise.工厂模式;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lenm
 */
public class Car implements Vehicle {
    /**
     * The constant car.
     */
    public static Car car = new Car();
    /**
     * 链接池有点类似于如此，使用的是多例模式
     */
    public List<Car> carList = new ArrayList<Car>();

    /**
     * Instantiates a new Car.
     */
    public Car() {
    }

    /**
     * 单例模式里面的饿汉式（这个可以叫做静态工厂方法）
     *
     * @return the instance
     */
    public static Car getInstance() {
        return car;
    }


    /**
     * Run.
     */
    public void run() {
        System.out.println("在疯狂地奔跑着...");
    }

}
