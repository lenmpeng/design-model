package com.sise.策略模式;

/**
 * The type Test.
 * @author lenm
 */
public class Test {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        System.out.println("使用了策略模式里面的枚举策略");
        System.out.println("1+1=" + Calculator.ADD.exec(1, 1));
        System.out.println("1-1=" + Calculator.SUB.exec(1, 1));
        System.out.println("1*1=" + Calculator.MULT.exec(1, 1));
        System.out.println("2/1=" + Calculator.DIV.exec(2, 1));
        CalculatorOriginal cal = new CalculatorOriginal();
        System.out.println(cal.exec(2, 2, "+"));
        System.out.println(cal.exec(2, 2, "-"));
        System.out.println(cal.exec(2, 2, "*"));
        System.out.println(cal.exec(2, 2, "/"));
    }
}
