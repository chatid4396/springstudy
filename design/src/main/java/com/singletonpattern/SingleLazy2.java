package com.singletonpattern;

/**
 * 懒汉式
 *  延迟加载
 *  线程安全
 */
public class SingleLazy2 {
    public static SingleLazy2 NEWINSTANCE;

    private SingleLazy2() {

    }

    public SingleLazy2 newInstance() {
        if (NEWINSTANCE == null) {
            synchronized (SingleLazy2.class) {
                if (NEWINSTANCE == null) {
                    NEWINSTANCE = new SingleLazy2();
                }
            }
        }
        return NEWINSTANCE;
    }
}
