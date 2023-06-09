package com.practice.DesignModeUsage.serviceDesignMode.interpreter_mode;

/**
 * 非终结符表达式
 */

public class NonterminalExpression implements AbstractExpression {

    private AbstractExpression successor;

    public void setSuccessor(AbstractExpression successor) {
        this.successor = successor;
    }

    public AbstractExpression getSuccessor() {
        return successor;
    }

    @Override
    public void interpret(Context context) {

    }
}
