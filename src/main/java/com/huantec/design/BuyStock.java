package com.huantec.design;

/**
 * 创建实现了 Order 接口的实体类。
 *
 * @author liuhuan
 */
public class BuyStock implements Order {
    private Stock abcStock;

    public BuyStock(Stock abcStock) {
        this.abcStock = abcStock;
    }

    public void execute() {
        abcStock.buy();
    }
}
