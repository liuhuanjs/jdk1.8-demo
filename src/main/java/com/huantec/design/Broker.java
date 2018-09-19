package com.huantec.design;

import java.util.ArrayList;
import java.util.List;

/**
 * 步骤 4:创建命令调用类。
 *
 * @author liuhuan
 */
public class Broker {
    private List<Order> orderList = new ArrayList<>();

    public void takeOrder(Order order){
        orderList.add(order);
    }

    public void placeOrders(){
        for (Order order : orderList) {
            order.execute();
        }
        orderList.clear();
    }
}
