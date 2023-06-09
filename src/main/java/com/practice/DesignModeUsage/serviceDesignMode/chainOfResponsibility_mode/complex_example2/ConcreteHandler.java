package com.practice.DesignModeUsage.serviceDesignMode.chainOfResponsibility_mode.complex_example2;

public class ConcreteHandler implements Handler{
    private Handler successor;
    public ConcreteHandler(Handler successor) {
        this.successor = successor;
    }

    @Override
    public void handleRequest(String request) {
        if (request.equals("Help")) {
            // 具体处理 Help的代码
        } else {
            // 传递到下一个
            successor.handleRequest(request);
        }
    }
}
