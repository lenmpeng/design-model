package com.sise.状态模式;

/**
 * 用“状态模式”设计一个多线程的状态转换程序。
 *
 * @author lenm
 * @date 2021 /1/21 11:01
 */
public class ThreadStateTest {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        ThreadContext context = new ThreadContext();
        context.start();
        context.getCPU();
        context.suspend();
        context.resume();
        context.getCPU();
        context.stop();
    }
}

/**
 * The type Thread context.
 */
//环境类
class ThreadContext {
    private ThreadState state;

    /**
     * Instantiates a new Thread context.
     */
    ThreadContext() {
        state = new New();
    }

    /**
     * Sets state.
     *
     * @param state the state
     */
    public void setState(ThreadState state) {
        this.state = state;
    }

    /**
     * Gets state.
     *
     * @return the state
     */
    public ThreadState getState() {
        return state;
    }

    /**
     * Start.
     */
    public void start() {
        ((New) state).start(this);
    }

    /**
     * Gets cpu.
     */
    public void getCPU() {
        ((Runnable) state).getCPU(this);
    }

    /**
     * Suspend.
     */
    public void suspend() {
        ((Running) state).suspend(this);
    }

    /**
     * Stop.
     */
    public void stop() {
        ((Running) state).stop(this);
    }

    /**
     * Resume.
     */
    public void resume() {
        ((Blocked) state).resume(this);
    }
}

/**
 * The type Thread state.
 */
//抽象状态类：线程状态
abstract class ThreadState {
    /**
     * The State name.
     */
    protected String stateName; //状态名
}

/**
 * The type New.
 */
//具体状态类：新建状态
class New extends ThreadState {
    /**
     * Instantiates a new New.
     */
    public New() {
        stateName = "新建状态";
        System.out.println("当前线程处于：新建状态.");
    }

    /**
     * Start.
     *
     * @param hj the hj
     */
    public void start(ThreadContext hj) {
        System.out.print("调用start()方法-->");
        if (stateName.equals("新建状态")) {
            hj.setState(new Runnable());
        } else {
            System.out.println("当前线程不是新建状态，不能调用start()方法.");
        }
    }
}

/**
 * The type Runnable.
 */
//具体状态类：就绪状态
class Runnable extends ThreadState {
    /**
     * Instantiates a new Runnable.
     */
    public Runnable() {
        stateName = "就绪状态";
        System.out.println("当前线程处于：就绪状态.");
    }

    /**
     * Gets cpu.
     *
     * @param hj the hj
     */
    public void getCPU(ThreadContext hj) {
        System.out.print("获得CPU时间-->");
        if (stateName.equals("就绪状态")) {
            hj.setState(new Running());
        } else {
            System.out.println("当前线程不是就绪状态，不能获取CPU.");
        }
    }
}

/**
 * The type Running.
 */
//具体状态类：运行状态
class Running extends ThreadState {
    /**
     * Instantiates a new Running.
     */
    public Running() {
        stateName = "运行状态";
        System.out.println("当前线程处于：运行状态.");
    }

    /**
     * Suspend.
     *
     * @param hj the hj
     */
    public void suspend(ThreadContext hj) {
        System.out.print("调用suspend()方法-->");
        if (stateName.equals("运行状态")) {
            hj.setState(new Blocked());
        } else {
            System.out.println("当前线程不是运行状态，不能调用suspend()方法.");
        }
    }

    /**
     * Stop.
     *
     * @param hj the hj
     */
    public void stop(ThreadContext hj) {
        System.out.print("调用stop()方法-->");
        if (stateName.equals("运行状态")) {
            hj.setState(new Dead());
        } else {
            System.out.println("当前线程不是运行状态，不能调用stop()方法.");
        }
    }
}

/**
 * The type Blocked.
 */
//具体状态类：阻塞状态
class Blocked extends ThreadState {
    /**
     * Instantiates a new Blocked.
     */
    public Blocked() {
        stateName = "阻塞状态";
        System.out.println("当前线程处于：阻塞状态.");
    }

    /**
     * Resume.
     *
     * @param hj the hj
     */
    public void resume(ThreadContext hj) {
        System.out.print("调用resume()方法-->");
        if (stateName.equals("阻塞状态")) {
            hj.setState(new Runnable());
        } else {
            System.out.println("当前线程不是阻塞状态，不能调用resume()方法.");
        }
    }
}

/**
 * The type Dead.
 */
//具体状态类：死亡状态
class Dead extends ThreadState {
    /**
     * Instantiates a new Dead.
     */
    public Dead() {
        stateName = "死亡状态";
        System.out.println("当前线程处于：死亡状态.");
    }
}
