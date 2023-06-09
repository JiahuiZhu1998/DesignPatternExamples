package com.practice.DesignModeUsage.serviceDesignMode.chainOfResponsibility_mode.complex_example3;

public class Request {
    private String type;
    public Request(String type) {this.type = type;}
    public String getType() {return type;}
    public void execute() {
        // request 具体行为代码
    }
}
