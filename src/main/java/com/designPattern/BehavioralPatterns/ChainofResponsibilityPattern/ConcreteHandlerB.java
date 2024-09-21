package com.designPattern.BehavioralPatterns.ChainofResponsibilityPattern;

public class ConcreteHandlerB extends Handler{
    @Override
    public void handleRequest(int request) {
        if(request < 20){
            System.out.println("Handler B handling request : " + request);
        }else {
            System.out.println("Hander B can not handler request " + request);
        }
    }
}
