package com.strategy;

public class StrategyMain {
    public static void main(String[] args) {
        Strategy strategy = new StrategyAdmin();
        Context context = new Context(strategy);
        context.strategyMethod();
    }
}
