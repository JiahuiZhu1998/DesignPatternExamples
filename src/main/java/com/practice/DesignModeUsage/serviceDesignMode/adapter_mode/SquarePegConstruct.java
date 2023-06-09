package com.practice.DesignModeUsage.serviceDesignMode.adapter_mode;

public class SquarePegConstruct implements ISquarePeg{

    @Override
    public void insert(String str) {
        System.out.println("SquarePeg insert(): " + str);
    }
}
