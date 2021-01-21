package com.sise.状态模式;


import java.util.HashMap;

/**
 * 状态模式的扩展
 *
 * @author lenm
 * @date 2021 /1/21 15:00
 */
public class FlyweightStatePattern {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        //创建环境
        ShareContext context = new ShareContext();
        //处理请求
        context.handle();
        context.handle();
        context.handle();
        context.handle();
    }
}

/**
 * 环境类
 */
class ShareContext {
    private ShareState state;
    private final HashMap<String, ShareState> stateSet = new HashMap<>();

    /**
     * Instantiates a new Share context.
     */
    public ShareContext() {
        state = new ConcreteState1();
        stateSet.put("1", state);
        state = new ConcreteState2();
        stateSet.put("2", state);
        state = getState("1");
    }

    /**
     * 设置新状态
     *
     * @param state the state
     */
    public void setState(ShareState state) {
        this.state = state;
    }

    /**
     * 读取状态
     *
     * @param key the key
     * @return the state
     */
    public ShareState getState(String key) {
        return stateSet.get(key);
    }

    /**
     * 对请求做处理
     */
    public void handle() {
        state.handle(this);
    }
}

/**
 * 抽象状态类
 */
abstract class ShareState {
    /**
     * Handle.
     *
     * @param context the context
     */
    public abstract void handle(ShareContext context);
}

/**
 * 具体状态1类
 */
class ConcreteState1 extends ShareState {
    @Override
    public void handle(ShareContext context) {
        System.out.println("当前状态是： 状态1");
        context.setState(context.getState("2"));
    }
}

/**
 * 具体状态2类
 */
class ConcreteState2 extends ShareState {
    @Override
    public void handle(ShareContext context) {
        System.out.println("当前状态是： 状态2");
        context.setState(context.getState("1"));
    }
}