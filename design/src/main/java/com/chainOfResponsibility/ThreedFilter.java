package com.chainOfResponsibility;

public class ThreedFilter implements Filter{
    @Override
    public boolean filter(Task task) {
        return false;
    }
}
