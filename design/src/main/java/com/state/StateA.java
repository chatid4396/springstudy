package com.state;

public class StateA implements State{
    @Override
    public void handle(Context context) {
        System.out.println("当前状态是 A.");
        context.setState(new StateB());
    }
}
