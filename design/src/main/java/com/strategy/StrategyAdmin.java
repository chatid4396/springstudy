package com.strategy;

public class StrategyAdmin implements Strategy{
    @Override
    public void StrategySayHello() {
        System.out.println("Hello,  Admin");
    }
}
