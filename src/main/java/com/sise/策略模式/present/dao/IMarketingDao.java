package com.sise.策略模式.present.dao;

import com.sise.策略模式.present.model.MarketingPO;

import java.util.List;

/**
 * The interface Marketing dao.
 *
 * @author lenm
 */
public interface IMarketingDao {

    /**
     * 根据营销id查询
     *
     * @param idList marketingId的集合
     * @return list list
     */
    List<MarketingPO> selectMarketingByIds(List<Integer> idList);
}
