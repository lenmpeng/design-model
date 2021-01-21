package com.sise.状态模式;

/**
 * 用“状态模式”设计一个学生成绩的状态转换程序。
 *
 * @author lenm
 * @date 2021 /1/21 10:20
 */
public class ScoreStateTest {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        ScoreContext account = new ScoreContext();
        System.out.println("学生成绩状态测试：");
        account.add(30);
        account.add(40);
        account.add(25);
        account.add(-15);
        account.add(-25);
    }
}

/**
 * 环境类
 */
class ScoreContext {
    private AbstractState state;

    /**
     * Instantiates a new Score context.
     */
    ScoreContext() {
        state = new LowState(this);
    }

    /**
     * Sets state.
     *
     * @param state the state
     */
    public void setState(AbstractState state) {
        this.state = state;
    }

    /**
     * Gets state.
     *
     * @return the state
     */
    public AbstractState getState() {
        return state;
    }

    /**
     * Add.
     *
     * @param score the score
     */
    public void add(int score) {
        state.addScore(score);
    }
}

/**
 * 抽象状态类
 */
abstract class AbstractState {
    /**
     * 环境
     */
    protected ScoreContext hj;
    /**
     * 状态名
     */
    protected String stateName;
    /**
     * 分数
     */
    protected int score;

    /**
     * Check state.
     */
    public abstract void checkState(); //检查当前状态

    /**
     * Add score.
     *
     * @param x the x
     */
    public void addScore(int x) {
        score += x;
        System.out.print("加上：" + x + "分，\t当前分数：" + score);
        checkState();
        System.out.println("分，\t当前状态：" + hj.getState().stateName);
    }
}

/**
 * 具体状态类：不及格
 */
class LowState extends AbstractState {
    /**
     * Instantiates a new Low state.
     *
     * @param h the h
     */
    public LowState(ScoreContext h) {
        hj = h;
        stateName = "不及格";
        score = 0;
    }

    /**
     * Instantiates a new Low state.
     *
     * @param state the state
     */
    public LowState(AbstractState state) {
        hj = state.hj;
        stateName = "不及格";
        score = state.score;
    }

    @Override
    public void checkState() {
        if (score >= 90) {
            hj.setState(new HighState(this));
        } else if (score >= 60) {
            hj.setState(new MiddleState(this));
        }
    }
}

/**
 * 具体状态类：中等
 */
class MiddleState extends AbstractState {
    /**
     * Instantiates a new Middle state.
     *
     * @param state the state
     */
    public MiddleState(AbstractState state) {
        hj = state.hj;
        stateName = "中等";
        score = state.score;
    }

    @Override
    public void checkState() {
        if (score < 60) {
            hj.setState(new LowState(this));
        } else if (score >= 90) {
            hj.setState(new HighState(this));
        }
    }
}

/**
 * 具体状态类：优秀
 */
class HighState extends AbstractState {
    /**
     * Instantiates a new High state.
     *
     * @param state the state
     */
    public HighState(AbstractState state) {
        hj = state.hj;
        stateName = "优秀";
        score = state.score;
    }

    @Override
    public void checkState() {
        if (score < 60) {
            hj.setState(new LowState(this));
        } else if (score < 90) {
            hj.setState(new MiddleState(this));
        }
    }
}