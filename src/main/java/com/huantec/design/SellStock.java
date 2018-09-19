package com.huantec.design;

/**
 * 创建实现了 Order 接口的实体类。
 * @author liuhuan
 */
public class SellStock implements Order{
    private Stock abcStock;

    public SellStock(Stock abcStock){
        this.abcStock = abcStock;
    }

    public void execute() {
        abcStock.sell();
    }
}
