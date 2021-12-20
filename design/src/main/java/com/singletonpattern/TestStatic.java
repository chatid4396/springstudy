package com.singletonpattern;


public class TestStatic {
    public static void main(String[] args) {
        StaticClass staticClass = new StaticClass();
        System.out.println("当前时间加载时间：      " + System.nanoTime());
        System.out.println("外部类静态变量加载时间：" + staticClass.STATIC_OUTER_DATE);
        System.out.println("外部类普通变量加载时间：" + staticClass.OUTER_DATE);
        staticClass.loadClass();
        StaticClass.staticLoadClass();

    }
}
