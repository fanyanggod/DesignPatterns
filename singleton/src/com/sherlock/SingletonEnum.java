package com.sherlock;

/**
 * @Author sherlock
 * @Date 2021/5/18
 */
public enum SingletonEnum {
    INSTANCE;
    public void say() {
        System.out.println("singleton enum");
    }
}
