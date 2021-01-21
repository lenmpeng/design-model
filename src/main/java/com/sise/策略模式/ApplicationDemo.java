package com.sise.策略模式;

import com.sise.策略模式.present.MarketingCoreService;
import com.sise.策略模式.present.impl.MarketingCoreServiceImpl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


/**
 * The type Application demo.
 *
 * @author lenm
 */
public class ApplicationDemo {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     * @throws Exception the exception
     */
    public static void main(String[] args) throws Exception {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        applicationContext.scan("com.sise.策略模式.present");
        //启动上下文
        applicationContext.refresh();
        MarketingCoreService marketingCoreService = applicationContext.getBean(MarketingCoreServiceImpl.class);
        marketingCoreService.doMarketingJob("p111");
    }
}
