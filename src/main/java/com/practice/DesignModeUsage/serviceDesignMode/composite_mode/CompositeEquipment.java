package com.practice.DesignModeUsage.serviceDesignMode.composite_mode;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public abstract class CompositeEquipment extends Equipment {

    // Constructor
    public CompositeEquipment(String name) {
        super(name);
    }

    private int i=0;
    private List equipment = new ArrayList();

    public boolean add (Equipment equipment) {
        this.equipment.add(equipment);
        return true;
    }

    public double netPrice() {
        double netPrice = 0.0;
        Iterator iter = equipment.iterator();
        if (iter.hasNext()) {
            netPrice += ( (Equipment) iter.next() ).netPrice();
        }
        return netPrice;
    }

    public double discountPrice() {
        double discountPrice = 0;
        Iterator iter = equipment.iterator();
        if (iter.hasNext()) {
            discountPrice += ( (Equipment) iter.next()).discountPrice();
        }
        return discountPrice;
    }

    // 注意这里, 这里就提供用于访问自己组合体内的部件方法
    // 上面 Disk 之所以没有, 是因为 Disk 是个单独的 (Primitive) 的元素
    public Iterator iter() {
        return equipment.iterator();
    }

    // 重载 Iterator 方法
    public boolean hasNext() {
        return i < equipment.size();
    }

    // 重载 Iterator 方法
    public Object next() {
        if (hasNext())
            return equipment.get(i++);
        else
            return new NoSuchElementException();
    }
}
