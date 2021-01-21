package com.sise.状态模式;

/**
 * The type State pattern client.
 *
 * @author lenm
 * @date 2021 /1/21 10:53
 */
public class StatePatternClient {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        Context context = new Context();    //创建环境
        context.Handle();    //处理请求
        context.Handle();
        context.Handle();
        context.Handle();
    }
}

/**
 * The type Context.
 */
//环境类
class Context {
    private State state;

    /**
     * Instantiates a new Context.
     */
//定义环境类的初始状态
    public Context() {
        this.state = new ConcreteStateA();
    }

    /**
     * Sets state.
     *
     * @param state the state
     */
//设置新状态
    public void setState(State state) {
        this.state = state;
    }

    /**
     * Gets state.
     *
     * @return the state
     */
//读取状态
    public State getState() {
        return (state);
    }

    /**
     * Handle.
     */
//对请求做处理
    public void Handle() {
        state.Handle(this);
    }
}

/**
 * The type State.
 */
//抽象状态类
abstract class State {
    /**
     * Handle.
     *
     * @param context the context
     */
    public abstract void Handle(Context context);
}

/**
 * The type Concrete state a.
 */
//具体状态A类
class ConcreteStateA extends State {
    public void Handle(Context context) {
        System.out.println("当前状态是 A.");
        context.setState(new ConcreteStateB());
    }
}

/**
 * The type Concrete state b.
 */
//具体状态B类
class ConcreteStateB extends State {
    public void Handle(Context context) {
        System.out.println("当前状态是 B.");
        context.setState(new ConcreteStateA());
    }
}