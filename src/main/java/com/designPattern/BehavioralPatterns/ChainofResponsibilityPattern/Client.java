package com.designPattern.BehavioralPatterns.ChainofResponsibilityPattern;

public class Client {
    public static void main(String[] args) {
        Handler handlerA = new ConcreteHandlerA();
        Handler handlerB = new ConcreteHandlerB();

        handlerA.setNextHandler(handlerB);

        handlerA.handleRequest(5);//A、B均处理
        System.out.println("---------------");
        handlerA.handleRequest(15);//A不处理，B处理
        System.out.println("---------------");
        handlerA.handleRequest(25);//A、B均不处理


    }
}
