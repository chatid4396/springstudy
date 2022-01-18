package com.strategy;


/**
 * 策略模式: 上下文、 抽象策略、 具体策略
 * 客户端必须清楚的明白调用策略的规则，让算法的变化独立于使用算法的客户
 *  将每一个算法封装到具有共同接口的独立的类中，从而使得它们可以相互替换。策略模式使得算法可以在不影响到客户端的情况下发生变化.
 */
public class StrategyMain {
    public static void main(String[] args) {
        Strategy strategy = new StrategyAdmin();
        Context context = new Context(strategy);
        context.strategyMethod();
    }
}
