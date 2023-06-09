package com.practice.DesignModeUsage.serviceDesignMode.visitor_mode;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ConcreteVisitor implements Visitor {

    @Override
    public void visitString(StringElement stringE) {
        System.out.println("'" + stringE.getValue() + "'");
    }

    @Override
    public void visitFloat(FloatElement floatE) {
        System.out.println(floatE.getValue().toString() + "f");
    }

    @Override
    public void visitCollection(Collection collection) {
        Iterator iterator = collection.iterator();
        while (iterator.hasNext()) {
            Object o = iterator.next();
            if (o instanceof Visitable)
                ((Visitable)o).accept(this);
        }
    }

    //  具体调用如下
    public static void main (String[] args) {
        Visitor visitor = new ConcreteVisitor();
        StringElement stringE = new StringElement("I am a String");
        visitor.visitString(stringE);
        Collection list = new ArrayList();
        list.add(new StringElement("I am a String1"));
        list.add(new StringElement("I am a String2"));
        list.add(new FloatElement(new Float(12)));
        list.add(new StringElement("I am a String3"));
        visitor.visitCollection(list);
    }
}
