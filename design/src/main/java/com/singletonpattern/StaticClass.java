package com.singletonpattern;


/**
 * 类加载的顺序，
 * 生成类的实例时
 * 首先是加载静态类型的，静态代码块和静态变量，谁在前面谁先加载。
 * 再加载普通块和全局变量，谁在前面谁先加载。
 * 再加载构造方法
 *
 * 先静态，再普通
 * 块和变量谁前谁先
 * 构造方法在最后
 * 父类先于子类
 *
 * 普通方法和静态方法在调用时才加载
 */
public class StaticClass {

    //静态变量
    public static long STATIC_OUTER_DATE = System.nanoTime();

    //变量
    public long OUTER_DATE = System.nanoTime();

    //静态代码块
    static {
        System.out.println("静态块加载时间：       " + System.nanoTime());
    }

    public StaticClass () {
        System.out.println("构造方法加载的时间：    " + System.nanoTime());
    }

    //代码块
    {
        System.out.println("普通块加载时间：       " + System.nanoTime());
    }


    public static void staticLoadClass () {
        System.out.println("静态方法加载的时间：    " + System.nanoTime());
    }

    public void loadClass () {
        System.out.println("普通方法加载的时间：    " + System.nanoTime());
    }

    static class Inner {
        public static long INNER_STATIC_DATE = System.nanoTime();
        static{
            System.out.println("静态内部类静态块加载时间：" + System.nanoTime());
        }
    }

    class InnerClass {
        public long INNER_DATE = 0;
        public InnerClass() {
            INNER_DATE = System.nanoTime();
        }
    }

}

