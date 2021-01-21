package com.sise.策略模式.present.impl;

import com.sise.策略模式.present.MarketingCoreService;
import com.sise.策略模式.present.IMarketingStrategy;
import com.sise.策略模式.present.dao.IMarketingDao;
import com.sise.策略模式.present.dao.IMarketingProductDao;
import com.sise.策略模式.present.model.MarketingPO;
import com.sise.策略模式.present.model.MarketingProductPO;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 营销工具核心执行器
 *
 * @author lenm
 */
@Service
public class MarketingCoreServiceImpl implements MarketingCoreService {

    @Resource
    private IMarketingDao iMarketingDao;

    @Resource
    private IMarketingProductDao iMarketingProductDao;

    @Resource
    private ApplicationContext applicationContext;

    @Override
    public boolean doMarketingJob(String productNo) throws ClassNotFoundException {
        System.out.println("doMarketingJob begin =============");
        System.out.println(productNo);
        List<MarketingProductPO> pos = iMarketingProductDao.selectByProductNo(productNo);
        if (pos != null) {
            List<Integer> marketingIdList = pos.stream().map(MarketingProductPO::getMarketingId).collect(Collectors.toList());
            List<MarketingPO> pos1 = iMarketingDao.selectMarketingByIds(marketingIdList);
            for (MarketingPO po : pos1) {
                String marketingName = po.getMarketingName();
                Class<?> clazz = Class.forName(marketingName);
                IMarketingStrategy marketingStrategy = (IMarketingStrategy) applicationContext.getBean(clazz);
                marketingStrategy.doMarketing(po.getInputVal());
            }
            System.out.println("doMarketingJob end =============");
            return true;
        }
        System.out.println("doMarketingJob setting is empty ===========");
        return false;
    }
}
