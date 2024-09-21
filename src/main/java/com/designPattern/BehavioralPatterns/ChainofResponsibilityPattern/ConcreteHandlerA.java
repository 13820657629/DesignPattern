package com.designPattern.BehavioralPatterns.ChainofResponsibilityPattern;

public class ConcreteHandlerA extends Handler{
    @Override
    public void handleRequest(int request) {
        if(request < 10){
            System.out.println("Handler A handiling request : " + request);
            //A处理完请求后，将请求传递给下一个处理者
            if(nextHandler != null){
                nextHandler.handleRequest(request);
            }
        }else {
            System.out.println("Handler A can not handle request" + request);
            //A无法处理该请求，传递给下一个处理者
            if(nextHandler != null){
                nextHandler.handleRequest(request);
            }
        }
    }
}
