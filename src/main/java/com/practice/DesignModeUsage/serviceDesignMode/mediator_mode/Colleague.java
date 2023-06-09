package com.practice.DesignModeUsage.serviceDesignMode.mediator_mode;

public class Colleague {
    private Mediator mediator;
    public Mediator getMediator() {
        return mediator;
    }
    public void setMediator (Mediator mediator) {
        this.mediator = mediator;
    }
}
