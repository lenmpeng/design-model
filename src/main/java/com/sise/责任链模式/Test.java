package com.sise.责任链模式;


/**
 * The type Test.
 * @author lenm
 */
public class Test {


    /**
     * The Filter chain.
     */
    public FilterChain filterChain = new FilterChain();

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        String str = "<html></html> this is a test! :) ";
        FilterChain filterChain = new FilterChain();
        filterChain.addFilter(new HtmlFilter())
                .addFilter(new FaceFilter());
        String r = filterChain.doFilter(str);
        System.out.println(r);
    }
}
