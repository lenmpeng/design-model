package com.sise.策略模式.present;

/**
 * 关于营销手段的策略
 *
 * @author lenm
 */
public interface IMarketingStrategy {

    /**
     * 服务赠送的策略执行
     *
     * @param param 参数
     * @return boolean boolean
     */
    boolean doMarketing(Object... param);
}
