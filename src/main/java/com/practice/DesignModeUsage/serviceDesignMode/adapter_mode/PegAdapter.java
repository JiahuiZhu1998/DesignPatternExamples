package com.practice.DesignModeUsage.serviceDesignMode.adapter_mode;

/**
 *  当前Adapter 实现 既要打方形桩, 也要打原型桩 (将 composition 和 inheritance 综合使用)
 *  Adaptee: RoundPeg
 *  Adapter: PegAdapter
 *  Target: SquarePeg
 */
public class PegAdapter extends SquarePeg{
    private RoundPeg roundPeg;

    public PegAdapter(RoundPeg peg) {
        this.roundPeg = peg;
    }

    public void insert(String str) {
        roundPeg.insertIntohole(str);
    }
}
