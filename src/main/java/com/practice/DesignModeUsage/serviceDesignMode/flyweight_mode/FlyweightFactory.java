package com.practice.DesignModeUsage.serviceDesignMode.flyweight_mode;

import java.util.Hashtable;

public class FlyweightFactory {
    // Flyweight pool
    private Hashtable flyweights = new Hashtable();

    public Flyweight getFlyweight (Object key) {
        Flyweight flyweight = (Flyweight) flyweights.get(key);
        if (null == flyweight) {
            // 产生新的 ConcreteFlyweight
            flyweight = new ConcreteFlyweight();
            flyweights.put(key, flyweight);
        }
        return flyweight;
    }

    // 具体如何使用
    public static void main (String[] args) {
        FlyweightFactory factory = new FlyweightFactory();
        Flyweight fly1 = factory.getFlyweight("Fred");
        Flyweight fly2 = factory.getFlyweight("Wilma");
    }
}
