package com.practice.DesignModeUsage.serviceDesignMode.adapter_mode;

/**
 * two-way adapter
 * 另一种 adapter 被称为 Pluggable Adapters: 动态获取adapters中的一个, 使用 Reflection技术调用其中public方法
 */
public class PegAdapterConstruct implements IRoundPeg, ISquarePeg{
    private RoundPeg roundPeg;
    private SquarePeg squarePeg;

    // Constructor
    public PegAdapterConstruct(RoundPeg peg) {
        this.roundPeg = peg;
    }

    // Constructor
    public PegAdapterConstruct(SquarePeg peg) {
        this.squarePeg = peg;
    }

    @Override
    public void insert(String str) {
        roundPeg.insertIntohole(str);
    }

    @Override
    public void insertIntoHole(String msg) {
        roundPeg.insertIntohole(msg);
    }
}
