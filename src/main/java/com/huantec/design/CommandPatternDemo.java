package com.huantec.design;

/**
 * 命令模式（Command Pattern）是一种数据驱动的设计模式，它属于行为型模式。
 * 请求以命令的形式包裹在对象中，并传给调用对象。调用对象寻找可以处理该命令的合适的对象，
 * 并把该命令传给相应的对象，该对象执行命令。
 *
 * @author liuhuan
 * @see <a href="http://www.runoob.com/design-pattern/command-pattern.html">http://www.runoob.com/design-pattern/command-pattern.html</a>
 */
public class CommandPatternDemo {
    public static void main(String[] args) {
        Stock abcStock = new Stock();

        BuyStock buyStockOrder = new BuyStock(abcStock);
        SellStock sellStockOrder = new SellStock(abcStock);

        Broker broker = new Broker();
        broker.takeOrder(buyStockOrder);
        broker.takeOrder(sellStockOrder);

        broker.placeOrders();
    }
}
