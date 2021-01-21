package com.sise.策略模式.present.impl;

import com.sise.策略模式.present.IMarketingStrategy;
import org.springframework.stereotype.Service;

/**
 * 新人赠送优惠券的策略
 *
 * @author lenm
 */
@Service
public class NewMemberCouponStrategy implements IMarketingStrategy {


    @Override
    public boolean doMarketing(Object... param) {
        System.out.println("新人赠送策略");
        return false;
    }
}
