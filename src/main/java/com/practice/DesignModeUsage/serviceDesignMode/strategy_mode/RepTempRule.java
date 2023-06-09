package com.practice.DesignModeUsage.serviceDesignMode.strategy_mode;

// 定义一些公用变量和方法
public abstract class RepTempRule {
    protected String oldString = "";
    public void setOldString(String oldString) {
        this.oldString = oldString;
    }
    protected String newString = "";
    public String getNewString() {
        return newString;
    }
    public abstract String replace(Site site, String oldString) throws Exception;
}
