package com.practice.DesignModeUsage.serviceDesignMode.flyweight_mode.example;

public class Artist {
    // 内部状态
    private String name;
    // note that Artist is immutable
    String getName() {return name;}

    Artist(String n) {
        name = n;
    }
}
