package com.huantec.feature.enumerate;

/**
 * @author liuhuan
 */
public class EnumDemo {
    public static void main(String[] args) {
        Direction front = Direction.FRONT;
        Direction front1 = Direction.FRONT;
        System.out.println(front.equals(front1));
        front.getType();

        SeasonEnum spring = SeasonEnum.SPRING;
        System.out.println(spring.getName());
    }
}
