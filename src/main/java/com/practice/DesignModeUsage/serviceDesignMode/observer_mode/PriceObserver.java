package com.practice.DesignModeUsage.serviceDesignMode.observer_mode;

import java.util.Observable;
import java.util.Observer;

public class PriceObserver implements Observer {
    private float price = 0;
    public void update(Observable obj, Object arg) {
        if (arg instanceof Float) {
            price = ((Float)arg).floatValue();
            System.out.println("PriceObserver: price changed to " + price);
        }
    }
}
