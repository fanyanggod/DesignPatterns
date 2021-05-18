package com.sherlock;

/**
 * @Author sherlock
 * @Date 2021/5/18
 *
 * 优点：延迟初始化，避免不必要的内存开销
 * 缺点：线程不安全
 *
 */
public class SingletonLazy {
    private static SingletonLazy lazy;

    private SingletonLazy() {

    }

    public static SingletonLazy getInstance() {
        if (lazy == null) {
            lazy = new SingletonLazy();
        }
        return lazy;
    }
}
