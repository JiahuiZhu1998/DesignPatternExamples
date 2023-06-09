package com.practice.DesignModeUsage.serviceDesignMode.composite_mode;

public class Chassis extends CompositeEquipment {

    public Chassis (String name) {
        super(name);
    }

    public double netPrice() {
        return 1.0 + super.netPrice();
    }

    public double discountPrice() {
        return 0.5 + super.discountPrice();
    }
}



