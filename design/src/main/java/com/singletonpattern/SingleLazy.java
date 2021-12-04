package com.singletonpattern;

/**
 * 懒汉式， 在第一次调用时，在生成
 */
public class SingleLazy {

    private SingleLazy() {}

    private volatile static SingleLazy single;

    public static SingleLazy newInstance() {
        if (single == null) {

            synchronized (SingleLazy.class) {
                if (single == null) {
                    single = new SingleLazy();
                }
            }


        }
        return single;
    }
}
