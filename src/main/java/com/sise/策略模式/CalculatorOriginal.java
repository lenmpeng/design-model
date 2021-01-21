package com.sise.策略模式;

/**
 * The type Calculator original.
 *
 * @author lenm
 */
public class CalculatorOriginal {

    /**
     * Add int.
     *
     * @param a the a
     * @param b the b
     * @return the int
     */
    public int add(int a, int b) {
        return a + b;
    }

    /**
     * Div int.
     *
     * @param a the a
     * @param b the b
     * @return the int
     */
    public int div(int a, int b) {
        return a / b;
    }

    /**
     * Sub int.
     *
     * @param a the a
     * @param b the b
     * @return the int
     */
    public int sub(int a, int b) {
        return a - b;
    }

    /**
     * Muit int.
     *
     * @param a the a
     * @param b the b
     * @return the int
     */
    public int muit(int a, int b) {
        return a * b;
    }

    /**
     * Exec int.
     *
     * @param a    the a
     * @param b    the b
     * @param sign the sign
     * @return the int
     */
    public int exec(int a, int b, String sign) {
        if (sign.equals("-")) {
            return this.sub(a, b);
        } else if (sign.equals("+")) {
            return this.add(a, b);
        } else if (sign.equals("*")) {
            return this.muit(a, b);
        } else {
            return this.div(a, b);
        }
    }
}
