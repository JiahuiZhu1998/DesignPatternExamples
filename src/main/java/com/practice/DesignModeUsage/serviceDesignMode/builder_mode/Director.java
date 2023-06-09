package com.practice.DesignModeUsage.serviceDesignMode.builder_mode;

/**
 * 管理者使用 Builder 打造零部件从而构造整车
 */
public class Director {
    private Builder builder; // 建造器

    // 管理者 Constructor
    public Director (Builder builder) {
        this.builder = builder;
    }

    // 构造整车方法
    public void construct () {
        builder.buildPartA();
        builder.buildPartB();
        builder.buildPartC();
    }
}
