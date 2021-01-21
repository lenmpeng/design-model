package com.sise.策略模式.present;


/**
 * 营销工具核心执行器
 *
 * @author lenm
 */
public interface MarketingCoreService {

    /**
     * 执行不同的营销工具
     *
     * @param productNo 产品编码
     * @return boolean boolean
     * @throws Exception the exception
     */
    boolean doMarketingJob(String productNo) throws Exception;
}
