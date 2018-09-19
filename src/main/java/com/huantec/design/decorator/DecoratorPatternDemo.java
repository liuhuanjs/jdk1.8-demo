package com.huantec.design.decorator;

import com.huantec.design.factory.Circle;
import com.huantec.design.factory.Rectangle;
import com.huantec.design.factory.Shape;

/**
 * 包装模式：向一个现有的对象添加新的功能，同时又不改变其结构
 * 需求：我们将把一个形状装饰上不同的颜色，同时又不改变形状类。
 * <p>URL：http://www.runoob.com/design-pattern/decorator-pattern.html</p>
 * @author liuhuan
 */
public class DecoratorPatternDemo {
    public static void main(String[] args) {
        Shape circle = new Circle();

        Shape redCircle = new RedShapeDecorator(new Circle());

        Shape redRectangle = new RedShapeDecorator(new Rectangle());
        System.out.println("Circle with normal border");
        circle.draw();

        System.out.println("\nCircle of red border");
        redCircle.draw();

        System.out.println("\nRectangle of red border");
        redRectangle.draw();
    }
}
