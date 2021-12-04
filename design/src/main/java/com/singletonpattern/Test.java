package com.singletonpattern;

public class Test {
    public static void main(String[] args) {
        //懒汉
        SingleLazy singleLazy = SingleLazy.newInstance();

        //饿汉
        SingleHungry singleHungry = SingleHungry.newInstance();

        System.out.println(singleLazy);
        System.out.println(singleHungry);
    }
}
