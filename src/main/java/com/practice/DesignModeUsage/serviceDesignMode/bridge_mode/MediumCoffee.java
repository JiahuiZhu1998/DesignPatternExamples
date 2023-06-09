package com.practice.DesignModeUsage.serviceDesignMode.bridge_mode;

public class MediumCoffee extends AbstractCoffee {

    AbstractCoffeeAction abstractCoffeeAction = this.getAbstractCoffeeAction();

    public void pourMilk() {
        // 添加个性化代码
        abstractCoffeeAction.pourMilk();
    }

    public void pourHotWater() {
        // 添加个性化代码
        abstractCoffeeAction.pourHotWater();
    }

    public void pourCoolWater() {
        // 添加个性化代码
        abstractCoffeeAction.pourHotWater();
    }
}
