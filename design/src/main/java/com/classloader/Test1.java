package com.classloader;

import java.lang.reflect.Method;

public class Test1 {
    static {
        System.out.println("static block");
    }

    public static void staticMethod() {
        System.out.println("static Method");
    }


}
