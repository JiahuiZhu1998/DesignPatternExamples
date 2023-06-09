package com.practice.DesignModeUsage.serviceDesignMode.chainOfResponsibility_mode.complex_example;

public class ConcreteHandler implements HelpHandler, PrintHandler, FormatHandler{

    // Initialization
    private HelpHandler helpSuccessor;
    private PrintHandler printSuccessor;
    private FormatHandler formatSuccessor;
    public ConcreteHandler (HelpHandler helpSuccessor, PrintHandler printSuccessor, FormatHandler formatSuccessor) {
        this.helpSuccessor = helpSuccessor;
        this.printSuccessor = printSuccessor;
        this.formatSuccessor = formatSuccessor;
    }

    @Override
    public void handleHelp() {
        // 关于 handlerHelp 的代码
    }

    @Override
    public void handleFormat() {
        // 转而处理 format
        this.formatSuccessor = formatSuccessor;
    }



    @Override
    public void handlePrint() {
        // 转而处理 print
        this.printSuccessor = printSuccessor;
    }
}
