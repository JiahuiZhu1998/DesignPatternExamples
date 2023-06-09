package com.practice.DesignModeUsage.serviceDesignMode.command_mode;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Producer {

    public static List productRequests() {
        List queue = new ArrayList();
        queue.add(new Engineer());
        queue.add(new Politician());
        queue.add(new Programmer());
        return queue;
    }

    public static void main (String[] args) {
        List queue = Producer.productRequests();
        // 客户端直接调用 execute 方法, 无需知道被调用者的其他更多类的方法名
        for (Iterator it = queue.iterator(); it.hasNext();) {
            ((Command)it.next()).execute();
        }
    }
}
