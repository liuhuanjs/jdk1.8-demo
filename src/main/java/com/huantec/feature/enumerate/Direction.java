package com.huantec.feature.enumerate;

/**
 * 自定义方向枚举类
 * @author liuhuan
 */
public class Direction {
    public static final Direction FRONT = new Direction("FRONT");
    public static final Direction BACK = new Direction("BACK");

    private String type;

    public Direction(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
