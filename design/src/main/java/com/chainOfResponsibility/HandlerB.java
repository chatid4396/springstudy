package com.chainOfResponsibility;

public class HandlerB extends Handler{
    @Override
    public void execute(String request) {
        if (request.equals("B")) {
            System.out.println("HandlerB 处理请求" + request);
        } else {
            if (getNext() != null) {
                getNext().execute(request);
            } else {
                System.out.println("没有人处理该请求！");
            }
        }
    }
}
