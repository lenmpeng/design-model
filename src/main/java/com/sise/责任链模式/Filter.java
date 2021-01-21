package com.sise.责任链模式;

/**
 * The interface Filiter.
 *
 * @author：idea
 * @date：2018/2/3
 * @version： <h1></h1>
 */
public interface Filter {

    /**
     * Do filiter string.
     *
     * @param str the str
     * @return the string
     */
    public String doFilter(String str);
}
