package com.sise.策略模式.present.dao.impl;

import com.sise.策略模式.present.dao.IMarketingDao;
import com.sise.策略模式.present.model.MarketingPO;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * 模拟dao层操作
 *
 * @author lenm
 */
@Repository
public class MarketingDao implements IMarketingDao {

    private static final List<MarketingPO> MARKETING_LIST = new ArrayList();

    static {
        MarketingPO disCountMarket = MarketingPO.builder()
                .id(1).marketingName("com.sise.策略模式.present.impl.DiscountStrategy").des("折扣优惠").inputVal("7").build();
        MarketingPO redPacketMarket = MarketingPO.builder()
                .id(2).marketingName("com.sise.策略模式.present.impl.RedPacketStrategy").des("红包优惠").inputVal("80").build();
        MarketingPO newMemberCouponMarket = MarketingPO.builder()
                .id(3).marketingName("com.sise.策略模式.present.impl.NewMemberCouponStrategy").des("新人优惠券发送").inputVal("10").build();
        MARKETING_LIST.add(newMemberCouponMarket);
        MARKETING_LIST.add(disCountMarket);
        MARKETING_LIST.add(redPacketMarket);
    }

    @Override
    public List<MarketingPO> selectMarketingByIds(List<Integer> idList) {
        List<MarketingPO> pos = new ArrayList<>(idList.size());
        for (MarketingPO po : MARKETING_LIST) {
            if (idList.contains(po.getId())) {
                pos.add(po);
            }
        }
        return pos;
    }
}
