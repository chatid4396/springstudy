package com.chainOfResponsibility;

public class SecondFilter implements Filter{
    @Override
    public boolean filter(Task task) {
        return false;
    }
}
