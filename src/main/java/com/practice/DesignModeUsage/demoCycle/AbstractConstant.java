package com.practice.DesignModeUsage.demoCycle;


import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.util.concurrent.atomic.AtomicLong;

@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
public abstract class AbstractConstant<T extends AbstractConstant<T>> implements Constant<T> {
    private static final AtomicLong uniqueIdGenerator = new AtomicLong();
    private final int id;
    private final String name;
    private final long uniquifier;

    protected AbstractConstant(int id, String name) {
        this.id = id;
        this.name = name;
        this.uniquifier = uniqueIdGenerator.getAndIncrement();
    }

}