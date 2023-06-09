package com.practice.DesignModeUsage.serviceDesignMode.bridge_mode;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class AbstractCoffee {
    // Bridge 模式 将 抽象和行为分离
    AbstractCoffeeAction abstractCoffeeAction;
}
