package com.practice.DesignModeUsage.serviceDesignMode.chainOfResponsibility_mode;

public class ConcreteHandler implements Handler{

    // Initialization
    private Handler successor;
    public ConcreteHandler (Handler successor) {
        this.successor = successor;
    }

    // methods

    @Override
    public void handlerHelp() {
        // 具体处理 handleHelp相关
    }

    @Override
    public void handlePrint() {
        // 转去处理 print
        successor.handlePrint();
    }

    @Override
    public void handleFormat() {
        // 转去处理format
        successor.handleFormat();
    }
}
