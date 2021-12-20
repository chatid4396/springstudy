package com.singletonpattern;

/**
 * 懒汉式
 *  延迟加载
 *  线程不安全
 */
public class SingleLazy1 {
    public static SingleLazy1 NEWINSTANCE;

    private SingleLazy1() {

    }

    public SingleLazy1 newInstance() {
        if (NEWINSTANCE == null) {
            NEWINSTANCE = new SingleLazy1();
        }
        return NEWINSTANCE;
    }
}
