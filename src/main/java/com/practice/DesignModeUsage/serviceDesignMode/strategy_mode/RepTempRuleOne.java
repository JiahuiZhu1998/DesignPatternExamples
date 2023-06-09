package com.practice.DesignModeUsage.serviceDesignMode.strategy_mode;

public class RepTempRuleOne extends RepTempRule {

    @Override
    public String replace(Site site, String oldString) throws Exception {
        // replaceFirst 是 jdk1.4新特性
        newString = oldString.replaceFirst("aaa", "bbbb");
        System.out.println("this is replace one");
        return newString;
    }
}
