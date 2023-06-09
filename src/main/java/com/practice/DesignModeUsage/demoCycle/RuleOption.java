package com.practice.DesignModeUsage.demoCycle;


import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public abstract class RuleOption<T> extends AbstractConstant<RuleOption<T>> {

    private final List<RuleOption<?>> ruleOptions;  // 每一个规则可以获得所有规则
    private final List<Object> ruleLimits; // 限制范围

    public RuleOption(int id, String name, long uniquifier, List<RuleOption<?>> ruleOptions, List<Object> ruleLimits) {
        super(id, name, uniquifier);
        this.ruleOptions = ruleOptions;
        this.ruleLimits = ruleLimits;
    }
}
