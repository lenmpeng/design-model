package com.sise.策略模式.present.dao;

import com.sise.策略模式.present.model.MarketingProductPO;

import java.util.List;

/**
 * The interface Marketing product dao.
 *
 */
public interface IMarketingProductDao {

    /**
     * 按照产品编码查询
     *
     * @param productNo 产品编码
     * @return list list
     */
    List<MarketingProductPO> selectByProductNo(String productNo);
}
