package com.practice.DesignModeUsage.demoCycle;

public interface Constant<T extends Constant<T>> extends Comparable<T> {
    int id();
    String name();
}