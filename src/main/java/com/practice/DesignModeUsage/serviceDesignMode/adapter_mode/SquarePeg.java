package com.practice.DesignModeUsage.serviceDesignMode.adapter_mode;

/**
 *  Adapter 适配器: 将两个不兼容的类合在一起使用, 需要 Adaptee 和 Adaptor
 *  实现 Adapter 的方式: composition 组合 和 inheritance 继承
 */

/**
 *  方形桩
 */
public class SquarePeg {
    public void insert(String str) {
        System.out.println("SquarePeg insert(): " + str);
    }
}
