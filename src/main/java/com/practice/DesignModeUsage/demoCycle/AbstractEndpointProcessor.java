package com.practice.DesignModeUsage.demoCycle;

import java.util.ArrayList;
import java.util.List;

/**
 * @param <T>  AbstractEndpointProcessor
 * @param <E>  Endpoint 进入
 */
public abstract class AbstractEndpointProcessor <T extends AbstractEndpointProcessor<T, E>, E> implements Processor{

    private List<RuleOption<?>> currOptions = new ArrayList<>(); // Endpoint 转化为的 RuleOption

    Endpoint endpoint;
    // 将 Endpoint 转化为 List<RuleOption>
    public List<RuleOption<?>> generateRule() {
        Endpoint endpoint1 = endpoint; // 传入 endPoint
        return new ArrayList<>();
    }
}
