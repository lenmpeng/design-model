package com.sise.策略模式.present.impl;

import com.sise.策略模式.present.IMarketingStrategy;
import org.springframework.stereotype.Service;

/**
 * 会员升级策略
 *
 * @author lenm
 */
@Service
public class UpgradeStrategy implements IMarketingStrategy {

    @Override
    public boolean doMarketing(Object... param) {
        System.out.println("升级策略");
        return false;
    }
}
