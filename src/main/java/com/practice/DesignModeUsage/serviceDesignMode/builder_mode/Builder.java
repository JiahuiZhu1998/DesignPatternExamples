package com.practice.DesignModeUsage.serviceDesignMode.builder_mode;

/*
 *    建造器模式接口
 */

public interface Builder {
    void buildPartA(); //
    void buildPartB();
    void buildPartC();
    Product getProduct(); // Product = A + B + C
}
