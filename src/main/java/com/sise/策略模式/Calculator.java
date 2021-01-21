package com.sise.策略模式;


/**
 * 使用策略枚举
 * @author lenm
 */
public enum Calculator {

    /**
     * The Add.
     */
    ADD("+") {
        @Override
        public int exec(int a, int b) {
            return a + b;
        }
    },
    /**
     * The Sub.
     */
    SUB("-") {
        @Override
        public int exec(int a, int b) {
            return a - b;
        }
    },
    /**
     * The Div.
     */
    DIV("/") {
        @Override
        public int exec(int a, int b) {
            return a / b;
        }
    },
    /**
     * The Mult.
     */
    MULT("*") {
        @Override
        public int exec(int a, int b) {
            return a * b;
        }
    };

    /**
     * The Value.
     */
    String value;

    Calculator(String value) {
        this.value = value;
    }

    /**
     * Exec int.
     *
     * @param a the a
     * @param b the b
     * @return the int
     */
    public abstract int exec(int a, int b);

}
