package com.practice.DesignModeUsage.serviceDesignMode.strategy_mode;

public class RepTempRuleSolve {
    private RepTempRule strategy;
    public RepTempRuleSolve(RepTempRule rule) {
        this.strategy = rule;
    }
    public String getNewContext(Site site, String oldString) throws Exception {
        return strategy.replace(site, oldString);
    }
    public void changeAlgorithm(RepTempRule newAlgorithm) {
        strategy = newAlgorithm;
    }


    // 调用方案
    public static void main(String[] args) throws Exception {
        Site site = new Site();
        String context = null;

        // 使用第一套替代方案
        RepTempRuleSolve solver = new RepTempRuleSolve(new RepTempRuleOne());
        solver.getNewContext(site, context);

        // 使用第二套替代方案
        RepTempRuleSolve solver_new = new RepTempRuleSolve(new RepTempRuleTwo());
        solver_new.getNewContext(site, context);
    }
}
