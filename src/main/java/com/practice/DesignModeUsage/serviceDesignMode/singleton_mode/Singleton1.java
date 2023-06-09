package com.practice.DesignModeUsage.serviceDesignMode.singleton_mode;

public class Singleton1 {

    private Singleton1(){}

    private static Singleton1 instance = new Singleton1(); // 创建内部实例

    // 提供给外部访问内部实例的方法
    public static Singleton1 getInstance() {
        return instance;
    }
}
