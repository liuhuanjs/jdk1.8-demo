package com.huantec.design.factory;

/**
 * @author liuhuan
 */
public class FactoryPatternDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
//        获取 Circle 的对象，并调用它的 draw 方法
        Shape shape1 = shapeFactory.getShape(ShapeConstant.CIRCLE);

//        调用 Circle 的 draw 方法
        shape1.draw();
    }
}
