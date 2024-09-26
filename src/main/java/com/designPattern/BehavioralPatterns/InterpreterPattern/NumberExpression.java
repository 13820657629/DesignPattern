package com.designPattern.BehavioralPatterns.InterpreterPattern;

//终结符表达式：数字
public class NumberExpression implements Expression{
    private int number;

    public NumberExpression(int number) {
        this.number = number;
    }

    @Override
    public int interpret() {
        return number;
    }
}
