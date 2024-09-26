package com.designPattern.BehavioralPatterns.InterpreterPattern;

public class test {
    public static void main(String[] args) {
        Evaluator evaluator = new Evaluator();
        String expression = "1 2 + 3 - 4 + 5 -";//表达式：1 + 2 - 3 + 4 - 5;
        Expression parsedExpression = evaluator.prese(expression);
        System.out.println("结果是:" + parsedExpression.interpret());
    }
}
