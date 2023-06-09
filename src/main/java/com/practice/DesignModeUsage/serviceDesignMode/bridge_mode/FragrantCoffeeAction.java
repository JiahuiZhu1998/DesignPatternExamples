package com.practice.DesignModeUsage.serviceDesignMode.bridge_mode;

/**
 * 不加奶
 */
public class FragrantCoffeeAction extends AbstractCoffeeAction{
    @Override
    public void pourMilk() {
        // System.out.println("没有");
    }

    @Override
    public void pourHotWater() {
        System.out.println("有");
    }

    @Override
    public void pourCoolWater() {
        System.out.println("有");
    }
}
