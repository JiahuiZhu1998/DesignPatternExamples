package com.practice.DesignModeUsage.serviceDesignMode.factory_mode;

public class SimpleFactory extends AbstractFactory{

    @Override
    public Sample creator() {return new SampleA(); }

    @Override
    public Sample2 creator(String name) {
        return new Sample2A();
    }
}
