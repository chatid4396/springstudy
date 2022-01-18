package com.chainOfResponsibility;

public class HandlerA extends Handler{
    @Override
    public void execute(String request) {
        if (request.equals("A")) {
            System.out.println("handlerA ： 处理"+ request);
        } else {
            if (getNext() != null ) {
                this.getNext().execute(request);
            } else {
                System.out.println("没有人处理请求" + request);
            }
        }
    }
}
