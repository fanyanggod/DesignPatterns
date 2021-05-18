package com.sherlock;

/**
 * @Author sherlock
 * @Date 2021/5/18
 */
public class SingletonHungry {
    private static SingletonHungry hungry = new SingletonHungry();

    private SingletonHungry(){}

    public static SingletonHungry getInstance() {
        return hungry;
    }

    public void say() {
        System.out.println("Singleton Hungry");
    }
}
