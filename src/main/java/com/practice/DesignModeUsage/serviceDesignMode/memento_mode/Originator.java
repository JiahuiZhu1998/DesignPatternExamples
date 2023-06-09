package com.practice.DesignModeUsage.serviceDesignMode.memento_mode;

public class Originator {
    int number;
    File file = null;
    public Originator() {}

    // 创建一个 Memento
    public Memento getMemento() {
        return new Memento(this);
    }

    // 恢复到原始值
    public void setMemento(Memento m) {
        number = m.number;
        file = m.file;
    }
}
