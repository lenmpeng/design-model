package com.sise.依赖倒置原则;/**
 *
 * @author lenm
 * @date 2021/2/1 14:36
 */
public class DIPtest {
    public static void main(String[] args) {
        Customer wang = new Customer();
        System.out.println("顾客购买以下商品：");
        wang.shopping(new ShaoguanShop());
        wang.shopping(new WuyuanShop());
    }
}

/**
 * 商店
 */
interface Shop {
    /**
     * 卖
     * @return
     */
    public String sell();
}

/**
 * 韶关网店
 */
class ShaoguanShop implements Shop {
    @Override
    public String sell() {
        return "韶关土特产：香菇、木耳……";
    }
}

/**
 * 婺源网店
 */
class WuyuanShop implements Shop {
    @Override
    public String sell() {
        return "婺源土特产：绿茶、酒糟鱼……";
    }
}

/**
 * 顾客
 */
class Customer {
    public void shopping(Shop shop) {
        //购物
        System.out.println(shop.sell());
    }
}