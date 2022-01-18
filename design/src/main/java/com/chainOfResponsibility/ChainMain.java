package com.chainOfResponsibility;


import java.util.ArrayList;
import java.util.List;

/**
 * 责任链模式：
 * 抽象处理者（Handler）角色：定义一个处理请求的接口，包含抽象处理方法和一个后继连接。
 * 具体处理者（Concrete Handler）角色：实现抽象处理者的处理方法，判断能否处理本次请求，如果可以处理请求则处理，否则将该请求转给它的后继者。
 * 客户类（Client）角色：创建处理链，并向链头的具体处理者对象提交请求，它不关心处理细节和请求的传递过程。
 *
 * 分为两种模式：外部调用的方式和节点调用模式
 *
 *
 * 就是用来处理相关事务责任的一条执行链，执行链上有多个节点，每个节点都有机会（条件匹配）处理请求事务，
 * 如果某个节点处理完了就可以根据实际业务需求传递给下一个节点继续处理或者返回处理完毕。
 */
public class ChainMain {
    public static void main(String[] args) {
        Handler handler = new HandlerA();
        handler.setNext(new HandlerB());

        handler.execute("B");

        List<Filter> list = new ArrayList<>();
        list.add(new FirstFilter());
        list.add(new SecondFilter());
        list.add(new ThreedFilter());

    }
}
