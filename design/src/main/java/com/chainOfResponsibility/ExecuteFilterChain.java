package com.chainOfResponsibility;

import java.util.Iterator;
import java.util.List;

public class ExecuteFilterChain {
    private List<Filter> filterList;

    public ExecuteFilterChain(List<Filter> list) {
        this.filterList = list;
    }

    public void executeChain(Task task) {
        for (Filter filter : filterList) {
            if (!filter.filter(task)) {
                break;
            }
        }
    }

}
