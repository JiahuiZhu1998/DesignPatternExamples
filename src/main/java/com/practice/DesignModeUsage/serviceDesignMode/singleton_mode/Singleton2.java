package com.practice.DesignModeUsage.serviceDesignMode.singleton_mode;

public class Singleton2 {
    private static Singleton2 instance = null;

    // 对外暴露方法优化 (不需要每次生成对象), 又称 lazy initialization
    public static synchronized Singleton2 getInstance() {
        if (instance==null) {
            instance = new Singleton2();
        }
        return instance;
    }
}
