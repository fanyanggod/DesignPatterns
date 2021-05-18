package com.sherlock;

/**
 * @Author sherlock
 * @Date 2021/5/18
 *
 * 如果对象已经创建，则不进入同步代码块，提高效率
 */
public class SingletonLazySafe2 {
    private static SingletonLazySafe2 lazySafe;

    private SingletonLazySafe2() {

    }

    public static SingletonLazySafe2 getInstance() {
        if (lazySafe == null) {
            synchronized (SingletonLazySafe2.class) {
                if (lazySafe == null) {
                    lazySafe = new SingletonLazySafe2();
                }
            }
        }
        return lazySafe;
    }
}
