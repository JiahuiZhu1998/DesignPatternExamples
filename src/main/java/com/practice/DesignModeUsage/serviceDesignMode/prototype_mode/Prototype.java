package com.practice.DesignModeUsage.serviceDesignMode.prototype_mode;

public class Prototype extends AbstractPrototype{
    public Prototype() {
        setPrototypeName("Prototype");
    }


    // 以下是如何调用 Prototype 模式
    AbstractPrototype prototype = new Prototype();
    AbstractPrototype prototype2 = (AbstractPrototype) prototype.clone();
}
