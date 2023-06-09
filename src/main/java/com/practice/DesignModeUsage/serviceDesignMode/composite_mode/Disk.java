package com.practice.DesignModeUsage.serviceDesignMode.composite_mode;

/**
 * Disk 由 Equipment 这个 Component 组成
 */
public class Disk extends Equipment {

    public Disk (String name) {
        super(name);
    }
    // 定义 Disk 实价为1
    @Override
    public double netPrice() {
        return 1;
    }

    // 定义 disk折扣价格是 0.5对折
    @Override
    public double discountPrice() {
        return 0.5;
    }
}
