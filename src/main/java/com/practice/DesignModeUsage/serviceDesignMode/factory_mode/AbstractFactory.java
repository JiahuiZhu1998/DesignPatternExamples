package com.practice.DesignModeUsage.serviceDesignMode.factory_mode;

/**
 * 工厂生成的类抽出 抽象共性部分组成抽象工厂
 */
public abstract class AbstractFactory {

    public abstract Sample creator();
    public abstract Sample2 creator(String name);
}
