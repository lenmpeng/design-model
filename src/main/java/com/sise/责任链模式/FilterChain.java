package com.sise.责任链模式;

import java.util.ArrayList;
import java.util.List;

/**
 * The type Filter chain.
 *
 * @author lenm
 */
public class FilterChain implements Filter {
    /**
     * The Filter list.
     */
    List<Filter> filterList = new ArrayList<>();


    /**
     * Add filter filter chain.
     *
     * @param filter the filter
     * @return the filter chain
     */
    public FilterChain addFilter(Filter filter) {
        filterList.add(filter);
        return this;
    }


    @Override
    public String doFilter(String str) {
        for (Filter filter : filterList) {
            str = filter.doFilter(str);
        }
        return str;
    }
}
