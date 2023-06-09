package com.practice.DesignModeUsage.serviceDesignMode.decorator_mode;

public class SquarePeg implements Work{

    @Override
    public void insert() {
        System.out.println("方形框插入");
    }
}
