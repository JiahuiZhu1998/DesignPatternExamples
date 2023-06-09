package com.practice.DesignModeUsage.serviceDesignMode.state_mode;

public class Context {

    private State state = null; // 将原来的 Color State 改成了新建的 State state;

    public void setState(State state) {
        this.state = state;
    }

    public void push() {
        // 状态的切换细节部分, 已经封装在 handlepush 中实现, 无需关心
        state.handlepush(this);
        Sample sample = new Sample(state);
        sample.operate();
    }

    public void pull() {
        state.handlepull(this);
        Sample2 sample2 = new Sample2(state);
        sample2.operate();
    }
}
