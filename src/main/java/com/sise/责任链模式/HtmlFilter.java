package com.sise.责任链模式;

/**
 * @author lenm
 */
public class HtmlFilter implements Filter {

    @Override
    public String doFilter(String str) {
        return str.replace("<", "[").replace(">", "]");
    }

}
