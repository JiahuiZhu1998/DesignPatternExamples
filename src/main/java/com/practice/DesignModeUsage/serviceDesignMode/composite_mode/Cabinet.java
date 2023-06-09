package com.practice.DesignModeUsage.serviceDesignMode.composite_mode;

import org.checkerframework.checker.units.qual.C;

public class Cabinet extends CompositeEquipment {

    public Cabinet (String name) {
        super(name);
    }

    public double netPrice() {
        return 1.0 + super.netPrice();
    }

    public double discountPrice() {
        return 0.5 + super.discountPrice();
    }



    public static void main (String args) {
        Cabinet cabinet = new Cabinet("Tower");
        Chassis chassis = new Chassis("PC Chassis");
        // 将 PC Chassis 装到 Tower 中 (将盘盒装到箱子里)
        cabinet.add(chassis);
        // 将一个 10GB 硬盘装到 PC Chassis
        chassis.add(new Disk("10GB"));
        System.out.println("netPrice = " + cabinet.netPrice());
        System.out.println("discountPrice =  " + cabinet.discountPrice());
    }
}
