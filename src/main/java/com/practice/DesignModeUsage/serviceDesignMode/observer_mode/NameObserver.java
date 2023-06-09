package com.practice.DesignModeUsage.serviceDesignMode.observer_mode;

import java.util.Observable;
import java.util.Observer;

public class NameObserver implements Observer {
    private String name = null;
    public void update (Observable obj, Object arg) {
        if (arg instanceof String) {
            name = (String) arg;
            // 产品名称改变值在name中
            System.out.println("NameObserver: name changed to " + name);
        }
    }
}
