package com.practice.DesignModeUsage.serviceDesignMode.chainOfResponsibility_mode.complex_example3;

/**
 * Chain of Responsibility 责任链模式
 */

public class ConcreteHandler implements Handler{

    private Handler successor;
    public ConcreteHandler(Handler successor) {
        this.successor = successor;
    }

    @Override
    public void handleRequest(Request request) {
        if (request instanceof HelpRequest) {
            // 这里是处理 Help 的代码
        } else if (request instanceof PrintRequest) {
            request.execute();
        } else {
            // 传递到下一个
            successor.handleRequest(request);
        }
    }
}
