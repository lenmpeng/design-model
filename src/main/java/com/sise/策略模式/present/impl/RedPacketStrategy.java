package com.sise.策略模式.present.impl;

import com.sise.策略模式.present.IMarketingStrategy;
import org.springframework.stereotype.Service;

/**
 * 红包赠送策略
 *
 * @author lenm
 */
@Service
public class RedPacketStrategy implements IMarketingStrategy {


    @Override
    public boolean doMarketing(Object... param) {
        System.out.println("红包赠送策略");
        return false;
    }
}
