package com.practice.DesignModeUsage.serviceDesignMode.strategy_mode;

public class RepTempRuleTwo extends RepTempRule{

    @Override
    public String replace(Site site, String oldString) throws Exception {
        newString = oldString.replaceFirst("aaa", "ccc");
        System.out.println("this is replace two");
        return newString;
    }
}
