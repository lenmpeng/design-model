package com.sise.接口隔离原则;

/**
 * The type Is ptest.
 *
 * @author lenm
 * @date 2021 /2/1 15:01
 */
public class ISPtest {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        InputModule input = StuScoreList.getInputModule();
        CountModule count = StuScoreList.getCountModule();
        PrintModule print = StuScoreList.getPrintModule();
        input.insert();
        count.countTotalScore();
        print.printStuInfo();
        //print.delete();
    }
}

/**
 * 输入模块接口
 */
interface InputModule {
    /**
     * Insert.
     */
    void insert();

    /**
     * Delete.
     */
    void delete();

    /**
     * Modify.
     */
    void modify();
}

/**
 * 统计模块接口
 */
interface CountModule {
    /**
     * Count total score.
     */
    void countTotalScore();

    /**
     * Count average.
     */
    void countAverage();
}

/**
 * 打印模块接口
 */
interface PrintModule {
    /**
     * Print stu info.
     */
    void printStuInfo();

    /**
     * Query stu info.
     */
    void queryStuInfo();
}

/**
 * 实现类
 */
class StuScoreList implements InputModule, CountModule, PrintModule {
    private StuScoreList() {
    }

    /**
     * Gets input module.
     *
     * @return the input module
     */
    public static InputModule getInputModule() {
        return (InputModule) new StuScoreList();
    }

    /**
     * Gets count module.
     *
     * @return the count module
     */
    public static CountModule getCountModule() {
        return (CountModule) new StuScoreList();
    }

    /**
     * Gets print module.
     *
     * @return the print module
     */
    public static PrintModule getPrintModule() {
        return (PrintModule) new StuScoreList();
    }

    @Override
    public void insert() {
        System.out.println("输入模块的insert()方法被调用！");
    }

    @Override
    public void delete() {
        System.out.println("输入模块的delete()方法被调用！");
    }

    @Override
    public void modify() {
        System.out.println("输入模块的modify()方法被调用！");
    }

    @Override
    public void countTotalScore() {
        System.out.println("统计模块的countTotalScore()方法被调用！");
    }

    @Override
    public void countAverage() {
        System.out.println("统计模块的countAverage()方法被调用！");
    }

    @Override
    public void printStuInfo() {
        System.out.println("打印模块的printStuInfo()方法被调用！");
    }

    @Override
    public void queryStuInfo() {
        System.out.println("打印模块的queryStuInfo()方法被调用！");
    }
}