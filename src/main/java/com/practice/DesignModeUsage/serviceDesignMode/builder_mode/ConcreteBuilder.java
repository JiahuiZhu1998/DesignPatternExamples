package com.practice.DesignModeUsage.serviceDesignMode.builder_mode;

public class ConcreteBuilder implements Builder{

    // 部件
    Part partA, partB, partC;

    @Override
    public void buildPartA() {
        // 具体如何实现 构造A部件代码
    }

    @Override
    public void buildPartB() {
        // 具体如何实现 构造B部件代码
    }

    @Override
    public void buildPartC() {
        // 具体如何实现 构造C部件代码
    }

    @Override
    public Product getProduct() {
        return null;
    }


    // 使用例子: CachePool 缓存池, 多人使用时, director 可以诊断哪一个部件出错
    public static void main(String[] args) {
        ConcreteBuilder builder = new ConcreteBuilder();
        Director director = new Director(builder);
        director.construct();
        Product product = builder.getProduct();
    }
}
