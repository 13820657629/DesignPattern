package com.designPattern.BehavioralPatterns.InterpreterPattern;


import java.util.Stack;

/**
 * 评估器类，创建一个 Evaluator 类可以更好地管理和组织表达式的构建和评估过程。
 * Evaluator 类可以负责解析输入并构建表达式树，使得主程序更加清晰和模块化。
 */
public class Evaluator {
    public Expression prese(String expression){
        Stack<Expression> stack = new Stack<>();
        String[] tokens = expression.split(" ");

        for(String token : tokens){
            if("+".equals(token)){
                Expression right = stack.pop();
                Expression left = stack.pop();
                stack.push(new AddExpression(left, right));
            }else if("-".equals(token)){
                Expression right = stack.pop();
                Expression left = stack.pop();
                stack.push(new SubtractExpression(left, right));
            }else{
                stack.push(new NumberExpression(Integer.parseInt(token)));
            }
        }
        return stack.pop();
    }
}
