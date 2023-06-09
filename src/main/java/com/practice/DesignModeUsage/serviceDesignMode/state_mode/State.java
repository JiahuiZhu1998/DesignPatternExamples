package com.practice.DesignModeUsage.serviceDesignMode.state_mode;

public abstract class State {
    public abstract void handlepush(Context c);
    public abstract void handlepull(Context c);
    public abstract void getcolor();
}
