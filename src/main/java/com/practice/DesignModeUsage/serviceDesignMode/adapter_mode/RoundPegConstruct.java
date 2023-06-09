package com.practice.DesignModeUsage.serviceDesignMode.adapter_mode;

public class RoundPegConstruct implements IRoundPeg{

    @Override
    public void insertIntoHole(String msg) {
        System.out.println("RoundPeg insertIntoHole(): " + msg);
    }
}
