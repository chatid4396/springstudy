package com.strategy;

public class StrategyUser implements Strategy{
    @Override
    public void StrategySayHello() {
        System.out.println("Hello,  User");
    }
}
