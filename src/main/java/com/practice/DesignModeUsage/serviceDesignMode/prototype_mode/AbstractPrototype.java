package com.practice.DesignModeUsage.serviceDesignMode.prototype_mode;

/**
 *   prototype_mode 原型模式, 拷贝原型创建新对象 (Clone)
 */
public abstract class AbstractPrototype implements Cloneable {
    String prototypeName;

    public void setPrototypeName(String prototypeName) {
        this.prototypeName = prototypeName;
    }

    public String getPrototypeName() {
        return this.prototypeName;
    }

    public Object clone() {
        Object object = null;
        try {
            object = super.clone();
        } catch (CloneNotSupportedException exception) {
            System.err.println("AbstractPrototype is not Cloneable");
        }
        return object;
    }
}
