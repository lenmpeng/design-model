package com.sise.策略模式.present.impl;

import com.sise.策略模式.present.IMarketingStrategy;
import org.springframework.stereotype.Service;

/**
 * 折扣优惠
 *
 * @author lenm
 */
@Service
public class DiscountStrategy implements IMarketingStrategy {


    @Override
    public boolean doMarketing(Object... param) {
        System.out.println("打折优惠");
        return false;
    }
}
