package com.practice.DesignModeUsage.serviceDesignMode.flyweight_mode;

public class ConcreteFlyweight implements Flyweight {
    private IntrinsicState state;
    @Override
    public void operation(ExtrinsicState state) {
        // 具体操作
    }
}
