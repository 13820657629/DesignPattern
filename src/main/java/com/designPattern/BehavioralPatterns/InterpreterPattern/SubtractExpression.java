package com.designPattern.BehavioralPatterns.InterpreterPattern;

//非终结符表达式：减法
public class SubtractExpression implements Expression{
    private Expression left;
    private Expression right;

    public SubtractExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpret() {
        return left.interpret() - right.interpret();
    }
}
