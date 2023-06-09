package com.practice.DesignModeUsage.serviceDesignMode.bridge_mode;

public class MilkCoffeeAction extends AbstractCoffeeAction{
    @Override
    public void pourMilk() {
        System.out.println("有");
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
