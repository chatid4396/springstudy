package com.chainOfResponsibility;

public class FirstFilter implements Filter{
    @Override
    public boolean filter(Task task) {
        return false;
    }
}
