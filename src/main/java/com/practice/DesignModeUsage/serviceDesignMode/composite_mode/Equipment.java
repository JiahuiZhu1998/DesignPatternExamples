package com.practice.DesignModeUsage.serviceDesignMode.composite_mode;

import java.util.Iterator;

/**
 *  这里 Equipment 就是 一个 Component
 */
public abstract class Equipment {
    private String name;
    public abstract double netPrice(); // 实际价格
    public abstract double discountPrice(); // 折扣价格
    public boolean add (Equipment equipment) { return false; } // 增加部件方法
    public boolean remove (Equipment equipment) { return false; } // 删除部件方法
    public Iterator iter() {return null;}
    public Equipment (final String name) {
        this.name = name;
    }

}
