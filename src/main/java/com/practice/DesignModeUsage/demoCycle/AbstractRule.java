package com.practice.DesignModeUsage.demoCycle;

import java.util.*;

/**
 *
 * @param <R>  抽象规则
 * @param <E>  当前选择规则聚合
 */
public abstract class AbstractRule<R extends AbstractRule<R, E>, E extends AbstractEndpointProcessor> implements Cloneable {

    private List<RuleOption<?>> options = new ArrayList<>(); // 所有规则枚举
    private List<RuleOption<?>> currOptions = new ArrayList<>(); // endPoint 转化为的规则
    private List<RuleOption<?>> finalOptions = new ArrayList<>(); // 最终选择规则
    AbstractRule(AbstractRule abstractRule, AbstractEndpointProcessor abstractEndpointProcessor, Endpoint endpoint) {
        this.options = abstractRule.options;
        this.currOptions = abstractEndpointProcessor.generateRule();
        this.finalOptions = this.election();
    }

    /**
     *  选举获得最终命中的规则
     */
    public List<RuleOption<?>> election () {
        List curr = this.currOptions; // endPoint 转化的规则
        // 计算
        return new ArrayList();
    }

}
