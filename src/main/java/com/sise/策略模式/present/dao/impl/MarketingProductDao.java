package com.sise.策略模式.present.dao.impl;

import com.sise.策略模式.present.dao.IMarketingProductDao;
import com.sise.策略模式.present.model.MarketingProductPO;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * The type Marketing product dao.
 *
 * @author lenm
 */
@Repository
public class MarketingProductDao implements IMarketingProductDao {

    private static final List<MarketingProductPO> MARKET_PRODUCT_LIST = new ArrayList<>();

    static {
        MarketingProductPO po = MarketingProductPO.builder()
                .productNo("p111")
                .marketingId(2)
                .validStatus(1)
                .des("2999套餐-发放优惠券")
                .build();
        MarketingProductPO po1 = MarketingProductPO.builder()
                .productNo("p111")
                .marketingId(3)
                .validStatus(1)
                .des("2999套餐-满额红包返现")
                .build();

        MARKET_PRODUCT_LIST.add(po);
        MARKET_PRODUCT_LIST.add(po1);
    }

    @Override
    public List<MarketingProductPO> selectByProductNo(String productNo) {
        List<MarketingProductPO> pos = new ArrayList<>();
        for (MarketingProductPO po : MARKET_PRODUCT_LIST) {
            //产品编码一致 而且规则有效
            if (po.getProductNo().equals(productNo) && po.getValidStatus() == 1) {
                pos.add(po);
            }
        }
        return pos;
    }
}
