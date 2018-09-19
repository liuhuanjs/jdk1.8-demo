package com.huantec.design.singleton;

/**
 * 使用条件：一个党派只能有一个总书记
 * @author liuhuan
 */
public class SingletonDemo {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
    }
}
