package com.sherlock;

/**
 * @Author sherlock
 * @Date 2021/5/18
 *
 * 优点：线程安全
 * 缺点：效率低
 */
public class SingletonLazySafe {
    private static SingletonLazySafe lazySafe;

    private SingletonLazySafe() {

    }

    public static synchronized SingletonLazySafe getInstance() {
        if (lazySafe == null) {
            lazySafe = new SingletonLazySafe();
        }
        return lazySafe;
    }
}
