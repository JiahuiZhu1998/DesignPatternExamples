package com.practice.DesignModeUsage.serviceDesignMode.decorator_mode;

import java.util.ArrayList;

public class DecoratorPegOne implements Work{

    // 抽象工作台
    private Work work;
    // 个性化定制方法
    private ArrayList<String> others = new ArrayList();

    // Constructor 构造个性化 DecoratorPegOne
    public DecoratorPegOne(Work work) {
        this.work = work;
        others.add("挖坑");
        others.add("钉木板");
    }

    @Override
    public void insert() {

    }

    /**
     *   以下是个性化方法定制: 可以通过 反射拿取对应方法 (挖坑, 钉木板)
     */

    public void digHole() {
        System.out.println("挖坑");
    }

    public void bindWood() {
        System.out.println("钉木板");
    }


    /**
     *  具体如何使用
     */
    public static void main (String args) {
        Work squarePeg = new SquarePeg();
        Work decorator = new DecoratorPegOne(squarePeg);
        decorator.insert();
    }

}
