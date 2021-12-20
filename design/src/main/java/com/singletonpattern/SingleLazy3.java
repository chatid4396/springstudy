package com.singletonpattern;


/**
 * 饿汉式， 静态内部类的方式
 * 在内部类被加载和初始化时，创建对象
 */
public class SingleLazy3 {

    private SingleLazy3() {
    }

    private static class Inner {
        private static final SingleLazy3 NEWINSTANCE = new SingleLazy3();
    }

    public SingleLazy3 getInstance() {
        return Inner.NEWINSTANCE;
    }

}
