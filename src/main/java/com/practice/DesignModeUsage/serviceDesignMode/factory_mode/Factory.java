package com.practice.DesignModeUsage.serviceDesignMode.factory_mode;

public class Factory {

    public static Sample create(int which) {
        if (which == 1) {
            return new SampleA();
        } else if (which == 2) {
            return new SampleB();
        }
        // 其他情况: 获取不到类
        return null;
    }

}
