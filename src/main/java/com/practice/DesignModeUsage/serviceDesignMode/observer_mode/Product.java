package com.practice.DesignModeUsage.serviceDesignMode.observer_mode;

import net.sf.jsqlparser.util.validation.metadata.NamedObject;
import org.apache.hadoop.yarn.webapp.hamlet.Hamlet;

import java.util.Observable;

public class Product extends Observable {
    private String name;
    private float price;
    public String getName() {return name;}
    public void setName(String name) {
        this.name = name;
        // 设置变化点
        setChanged();
        notifyObservers(name);
    }
    public float getPrice() { return price;}
    public void setPrice(float price) {
        this.price = price;
        // 设置变化点
        setChanged();
        notifyObservers(new Float(price));
    }
    // 以下数据库更新
    public void saveToDb() {

    }


    // 具体如何使用观察者模式
    public static void main (String[] args) {
        Product product = new Product();
        NameObserver nameobs = new NameObserver();
        PriceObserver priceobs = new PriceObserver();
        // 加入观察者
        product.addObserver(nameobs);
        product.addObserver(priceobs);
    }
}
