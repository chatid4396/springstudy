package com.singletonpattern;

/**
 * 饿汉式单例模式， 在加载类的时候就生成
 */
public class SingleHungry {

    private SingleHungry() { }

    private final static SingleHungry NEW_INSTANCE = new SingleHungry();

    public static SingleHungry newInstance () {
        return NEW_INSTANCE;
    }

}
