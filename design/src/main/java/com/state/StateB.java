package com.state;

public class StateB implements State{
    @Override
    public void handle(Context context) {
        System.out.println("当前状态是 B.");
        context.setState(new StateA());
    }
}
