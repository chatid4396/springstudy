package com.singletonpattern;

public class Test {
    public static void main(String[] args) {
        //懒汉
        SingleLazy2 singleLazy = SingleLazy2.NEWINSTANCE;

        //饿汉
        SingleHungry singleHungry = SingleHungry.newInstance();

        System.out.println(singleLazy);
        System.out.println(singleHungry);

        SingleHungryStatic singleHungryStatic = SingleHungryStatic.NEWINSTANCE;

        System.out.println(singleHungryStatic.getInfo());
    }
}
